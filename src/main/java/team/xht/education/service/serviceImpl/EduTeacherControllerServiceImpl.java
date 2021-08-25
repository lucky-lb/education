package team.xht.education.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.xht.education.dao.EduTeacherMapper;
import team.xht.education.entity.EduTeacher;
import team.xht.education.entity.EduTeacherExample;
import team.xht.education.reult.ResultData;
import team.xht.education.service.EduTeacherControllerService;

import java.util.List;

@Service
public class EduTeacherControllerServiceImpl implements EduTeacherControllerService {
    @Autowired
    private EduTeacherMapper mapper;

    @Override
    public ResultData<Object> findTeacherByName(String name,int page,int size) {
        ResultData<Object> resultData = new ResultData<>();
        EduTeacherExample example = new EduTeacherExample();
        EduTeacherExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike(name);
        PageHelper.startPage(page,size);
        List<EduTeacher> eduTeachers = mapper.selectByExample(example);
        System.out.println(eduTeachers.size());
        if (eduTeachers.size() == 0) {
            resultData.setCode(404);
            resultData.setMsg("teacher don't exist");
            return resultData;
        }
        PageInfo<EduTeacher> pageInfo=new PageInfo<>(eduTeachers);
        resultData.setCode(200);
        resultData.setMsg("find success");
        resultData.setData(pageInfo);
        return resultData;
    }
}
