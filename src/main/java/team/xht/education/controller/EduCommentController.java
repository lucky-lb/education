package team.xht.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.xht.education.entity.EduComment;
import team.xht.education.reult.ResultData;
import team.xht.education.service.EduCommentService;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class EduCommentController {
    @Autowired
    EduCommentService service;

    @GetMapping("/findCommentByCourseId")
    public ResultData<List<EduComment>> findCommentByCourseId(String id) {
        return service.findCommentByCourseId(id);
    }

    @GetMapping("/insertCommentByCourseIdAndMobile")
    public ResultData<Object> insertCommentByCourseIdAndMobile(String courseId, String mobile, String content) {
        return service.insertCommentByCourseIdAndMobile(courseId, mobile, content);
    }
}
