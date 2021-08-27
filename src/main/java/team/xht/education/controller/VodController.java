package team.xht.education.controller;


import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.vod.model.v20170321.DeleteVideoRequest;
import com.aliyuncs.vod.model.v20170321.GetVideoPlayAuthRequest;
import com.aliyuncs.vod.model.v20170321.GetVideoPlayAuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import team.xht.education.exception.XhtException;
import team.xht.education.reult.R;
import team.xht.education.service.VodService;
import team.xht.education.util.ConstantVodUtils;
import team.xht.education.util.InitVodClient;

import java.util.List;

@CrossOrigin//用于跨域
@RestController
@RequestMapping("/eduvod/video")
public class VodController {

    @Autowired
    private VodService vodService;

    //上传视频到阿里云
    @PostMapping("uploadAlyVideo")
    public R uploadAlyVideo(MultipartFile file){
        //返回视频id
        String videoId =vodService.uploadAlyVideo(file);
        return R.ok().data("videoId",videoId);
    }

    //根据视频id删除阿里云视频
    @DeleteMapping("removeAlyVideo/{id}")
    public R removeAlyVideo(@PathVariable String id){
        try {
            //初始化对象
            DefaultAcsClient client= InitVodClient.initVodClient(ConstantVodUtils.KEY_ID,ConstantVodUtils.KEY_SECRET);
            //创建删除视频request对象
            DeleteVideoRequest request=new DeleteVideoRequest();
            //向request设置视频id
            request.setVideoIds(id);
            //调用初始化方法实现删除
            client.getAcsResponse(request);
            return R.ok();
        }catch (Exception e){
            e.printStackTrace();
            throw new XhtException(20001,"删除视频失败");
        }
    }

    //删除多个视频，可以循环调用上面的方法，也可下面,参数是多个id
    @DeleteMapping("delete-batch")
    public R deleteBatch(@RequestParam("videoIdList") List<String> videoIdList){
        vodService.removeMoreAlyVideo(videoIdList);
        return R.ok();
    }

    //根据视频id获取视频凭证
    @GetMapping("getPlayAuth/{id}")
    public R getPlayAuth(@PathVariable String id){
        try {
            //创建初始化对象
            DefaultAcsClient client = InitVodClient.initVodClient(ConstantVodUtils.KEY_ID, ConstantVodUtils.KEY_SECRET);
            //创建获取凭证的request和response对象
            GetVideoPlayAuthRequest request=new GetVideoPlayAuthRequest();
            //向request设置视频id
            request.setVideoId(id);
            //调用方法获得凭证
            GetVideoPlayAuthResponse response = client.getAcsResponse(request);
            String playAuth=response.getPlayAuth();
            return R.ok().data("playAuth",playAuth);
        }catch (Exception e){
            throw new XhtException(20001,"获取凭证失败");
        }
    }

}
