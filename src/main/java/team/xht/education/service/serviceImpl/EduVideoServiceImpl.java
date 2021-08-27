package team.xht.education.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import team.xht.education.dao.EduVideoMapper;
import team.xht.education.entity.EduVideo;
import team.xht.education.entity.EduVideoExample;
import team.xht.education.reult.ResultData;
import team.xht.education.service.EduVideoService;
import team.xht.education.service.VodClient;

import java.util.ArrayList;
import java.util.List;

@Service
public class EduVideoServiceImpl  extends ServiceImpl<EduVideoMapper, EduVideo> implements EduVideoService {
    @Autowired
    private EduVideoMapper mapper;

    @Override
    public ResultData<Object> findVideoByChapterIdAndCourseId(String courseId,String chapterId){
        ResultData<Object> resultData=new ResultData<>();
        EduVideoExample example=new EduVideoExample();
        EduVideoExample.Criteria criteria = example.createCriteria();
        criteria.andChapterIdEqualTo(chapterId);
        criteria.andCourseIdEqualTo(courseId);
        List<EduVideo> eduVideos = mapper.selectByExample(example);
        if(eduVideos.size()==0){
            resultData.setCode(404);
            resultData.setMsg("find video error");
            return resultData;
        }
        resultData.setCode(200);
        resultData.setMsg("find success");
        resultData.setData(eduVideos);
        return resultData;
    }

    @Autowired
    private VodClient vodClient;

    @Override
    public void removeVideoByCourseId(String courseId) {
        //根据课程id查询出所有视频id并删除
        QueryWrapper<EduVideo> wrapperVideo=new QueryWrapper<>();
        wrapperVideo.eq("course_id",courseId);
        //只查询一个属性
        wrapperVideo.select("video_source_id");
        List<EduVideo> eduVideoList=baseMapper.selectList(wrapperVideo);
        // List<EduVideo>变成List<String>
        List<String> videoIds=new ArrayList<>();
        for (int i = 0; i < eduVideoList.size(); i++) {
            EduVideo eduVideo=eduVideoList.get(i);
            String videoSourceId=eduVideo.getVideoSourceId();
            if(!StringUtils.isEmpty(videoSourceId)){
                videoIds.add(videoSourceId);
            }
        }
        if(videoIds.size()>0){
            vodClient.deleteBatch(videoIds);
        }

        //删除小节
        QueryWrapper<EduVideo> wrapper=new QueryWrapper<>();
        wrapper.eq("course_id",courseId);
        baseMapper.delete(wrapper);
    }
}
