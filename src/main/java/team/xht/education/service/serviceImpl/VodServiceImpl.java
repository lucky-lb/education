package team.xht.education.service.serviceImpl;

import com.aliyun.vod.upload.impl.UploadVideoImpl;
import com.aliyun.vod.upload.req.UploadStreamRequest;
import com.aliyun.vod.upload.resp.UploadStreamResponse;
import com.aliyuncs.DefaultAcsClient;
import org.apache.commons.lang3.StringUtils;
import com.aliyuncs.vod.model.v20170321.DeleteVideoRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import team.xht.education.exception.XhtException;
import team.xht.education.service.VodService;
import team.xht.education.util.ConstantVodUtils;
import team.xht.education.util.InitVodClient;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


@Service
public class VodServiceImpl implements VodService {

    @Override
    public String uploadAlyVideo(MultipartFile file) {

        try {
            String fileName = file.getOriginalFilename();
            String title = fileName.substring(0, fileName.lastIndexOf("."));
            InputStream inputStream = file.getInputStream();
            //id，密码，上传之后显示的名称，上传文件原始名称，上传文件输入流
            UploadStreamRequest request = new UploadStreamRequest(ConstantVodUtils.KEY_ID, ConstantVodUtils.KEY_SECRET, title, fileName, inputStream);
            UploadVideoImpl uploader = new UploadVideoImpl();
            UploadStreamResponse response = uploader.uploadStream(request);
            System.out.print("RequestId=" + response.getRequestId() + "\n");  //请求视频点播服务的请求ID
            //videoID
            String videoId;
            if (response.isSuccess()) {
                videoId = response.getVideoId();
                System.out.print("VideoId=" + response.getVideoId() + "\n");
            } else { //如果设置回调URL无效，不影响视频上传，可以返回VideoId同时会返回错误码。其他情况上传失败时，VideoId为空，此时需要根据返回错误码分析具体错误原因
                videoId = response.getVideoId();
                System.out.print("VideoId=" + response.getVideoId() + "\n");
                System.out.print("ErrorCode=" + response.getCode() + "\n");
                System.out.print("ErrorMessage=" + response.getMessage() + "\n");
            }
            return videoId;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void removeMoreAlyVideo(List videoIdList) {
        try {
            //初始化对象
            DefaultAcsClient client = InitVodClient.initVodClient(ConstantVodUtils.KEY_ID, ConstantVodUtils.KEY_SECRET);
            //创建删除视频request对象
            DeleteVideoRequest request = new DeleteVideoRequest();

            //将videoIdList变成1,2,3用逗号隔开
            String videoIds = StringUtils.join(videoIdList.toArray(), ',');

            //向request设置视频id
            request.setVideoIds(videoIds);
            //调用初始化方法实现删除
            client.getAcsResponse(request);
        } catch (Exception e) {
            e.printStackTrace();
            throw new XhtException(20001, "删除视频失败");
        }
    }
}
