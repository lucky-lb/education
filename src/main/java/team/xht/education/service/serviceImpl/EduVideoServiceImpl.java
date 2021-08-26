package team.xht.education.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.xht.education.dao.EduVideoMapper;
import team.xht.education.entity.EduVideo;
import team.xht.education.entity.EduVideoExample;
import team.xht.education.reult.ResultData;
import team.xht.education.service.EduVideoService;

import java.util.List;

@Service
public class EduVideoServiceImpl implements EduVideoService {
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
}
