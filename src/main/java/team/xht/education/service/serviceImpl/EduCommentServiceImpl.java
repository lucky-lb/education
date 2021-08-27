package team.xht.education.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team.xht.education.dao.EduCommentMapper;
import team.xht.education.entity.EduComment;
import team.xht.education.entity.EduCommentExample;
import team.xht.education.entity.EduCourse;
import team.xht.education.entity.UcenterMember;
import team.xht.education.reult.ResultData;
import team.xht.education.service.EduCommentService;
import team.xht.education.service.EduCourseService;
import team.xht.education.service.UcenterMemberService;
import team.xht.education.util.DateAndLocal;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class EduCommentServiceImpl implements EduCommentService {
    @Autowired
    EduCommentMapper mapper;
    @Autowired
    UcenterMemberService memberService;
    @Autowired
    EduCourseService courseService;

    @Override
    public ResultData<List<EduComment>> findCommentByCourseId(String courseId) {
        EduCommentExample example = new EduCommentExample();
        EduCommentExample.Criteria criteria = example.createCriteria();
        criteria.andCourseIdEqualTo(courseId);
        List<EduComment> eduComments = mapper.selectByExample(example);
        return new ResultData<>(200, "find comment success", eduComments);
    }

    @Override
    @Transactional
    public ResultData<Object> insertCommentByCourseIdAndMobile(String courseId, String mobile, String content) {
        ResultData<Object> resultData = new ResultData<>();
        UcenterMember member = memberService.findMemberByMobile(mobile);
        EduCourse course = courseService.findCourseById(courseId);
        EduComment eduComment = new EduComment();
        String substring = UUID.randomUUID().toString().substring(0, 18);
        while (true) {
            EduComment comment = mapper.selectByPrimaryKey(substring);
            if (comment == null) {
                break;
            } else {
                substring = UUID.randomUUID().toString().substring(0, 18);
            }
        }
        eduComment.setId(substring);
        eduComment.setCourseId(courseId);
        eduComment.setTeacherId(course.getTeacherId());
        eduComment.setMemberId(member.getId());
        eduComment.setIsDeleted((byte) 0);
        eduComment.setGmtCreate(DateAndLocal.asLocal(new Date()));
        eduComment.setGmtModified(DateAndLocal.asLocal(new Date()));
        try {
          mapper.insert(eduComment);
          resultData.setCode(2001);
          resultData.setMsg("insert comment success");
        }catch (Exception e){
            e.printStackTrace();
            resultData.setCode(500);
            resultData.setMsg("insert comment failed");
        }
        return resultData;
    }
}
