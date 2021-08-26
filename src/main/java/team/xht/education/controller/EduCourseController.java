package team.xht.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.xht.education.reult.ResultData;
import team.xht.education.service.EduCourseService;

@RestController
@RequestMapping("/course")
public class EduCourseController {
    @Autowired
    EduCourseService service;

    @GetMapping("/findCourseByTitleLike")
    public ResultData<Object> findCourseByNameLike(String title,
                                                   @RequestParam(required = false,defaultValue = "1")int page,
                                                   @RequestParam(required = false,defaultValue = "10")int size) {
       return service.findCourseByTitleLike("%"+title+"%",page,size);
    }
}
