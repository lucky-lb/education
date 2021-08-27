package team.xht.education.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team.xht.education.dao.EduCourseMapper;
import team.xht.education.entity.EduCourse;
import team.xht.education.entity.EduCourseExample;
import team.xht.education.reult.ResultData;
import team.xht.education.service.EduCourseService;

import java.util.List;
import java.util.UUID;

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

    @Override
    public EduCourse findCourseById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Transactional
    @Override
    public ResultData<Object> insertCourse(EduCourse eduCourse) {
        ResultData<Object> resultData = new ResultData<>();
        String substring = UUID.randomUUID().toString().substring(0, 18);
        EduCourseExample example = new EduCourseExample();
        EduCourseExample.Criteria criteria;
        while (true) {
            example.clear();
            criteria = example.createCriteria();
            criteria.andIdEqualTo(substring);
            EduCourse temp = mapper.selectByPrimaryKey(substring);
            if (temp == null) {
                break;
            } else {
                substring = UUID.randomUUID().toString().substring(0, 18);
            }
        }
        try {
            mapper.insert(eduCourse);
            resultData.setCode(200);
            resultData.setMsg("insert course success");
        } catch (Exception e) {
            e.printStackTrace();
            resultData.setCode(500);
            resultData.setMsg("insert course error");
        }
        return resultData;
    }
}
