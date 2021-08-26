package team.xht.education.service.serviceImpl;

import com.alibaba.druid.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.xht.education.dao.EduChapterMapper;
import team.xht.education.entity.EduChapter;
import team.xht.education.entity.EduChapterExample;
import team.xht.education.reult.ResultData;
import team.xht.education.service.EduChapterService;

import java.util.List;

@Service
public class EduChapterServiceImpl implements EduChapterService {
    @Autowired
    private EduChapterMapper mapper;
    @Override
    public ResultData<Object> findChapterByCourseId(String courseId) {
        ResultData<Object> resultData=new ResultData<>();
        if(StringUtils.isEmpty(courseId)){
            resultData.setCode(404);
            resultData.setMsg("id is null");
            return resultData;
        }
        EduChapterExample example=new EduChapterExample();
        EduChapterExample.Criteria criteria = example.createCriteria();
        criteria.andCourseIdEqualTo(courseId);
        example.setOrderByClause("sort asc");
        List<EduChapter> eduChapters = mapper.selectByExample(example);
        resultData.setCode(200);
        resultData.setMsg("find success");
        resultData.setData(eduChapters);
        return resultData;
    }
}
