package team.xht.education.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.xht.education.dao.EduCourseMapper;
import team.xht.education.entity.EduCourse;
import team.xht.education.entity.EduCourseExample;
import team.xht.education.reult.ResultData;
import team.xht.education.service.EduCourseService;

import java.util.List;

@Service
public class EduCourseServiceImpl implements EduCourseService {
    @Autowired
    private EduCourseMapper mapper;

    @Override
    public ResultData<Object> findCourseByTitleLike(String title, int page, int size) {
        ResultData<Object> resultData = new ResultData<>();
        EduCourseExample example = new EduCourseExample();
        EduCourseExample.Criteria criteria = example.createCriteria();
        criteria.andTitleLike(title);
        PageHelper.startPage(page, size);
        List<EduCourse> eduCourses = mapper.selectByExample(example);
        System.out.println(eduCourses.size());
        if (eduCourses.size() == 0) {
            resultData.setCode(404);
            resultData.setMsg("course don't exist");
            return resultData;
        }
        PageInfo<EduCourse> pageInfo = new PageInfo<>(eduCourses);
        resultData.setCode(200);
        resultData.setMsg("find success");
        resultData.setData(pageInfo);
        return resultData;
    }
}
