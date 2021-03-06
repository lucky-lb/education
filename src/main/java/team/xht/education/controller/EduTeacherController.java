package team.xht.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.xht.education.reult.ResultData;
import team.xht.education.service.EduTeacherControllerService;

@CrossOrigin//用于跨域
@RestController
@RequestMapping("/teacher")
public class EduTeacherController {
    @Autowired
    private EduTeacherControllerService service;

    @RequestMapping("/findTeacherByNameLike")
    public ResultData<Object> findTeacherByNameLike(@RequestParam(required = false, defaultValue = "") String name,
                                                    @RequestParam(required = false, defaultValue = "1") int page,
                                                    @RequestParam(required = false, defaultValue = "10") int size) {
        return service.findTeacherByNameLike("%" + name + "%", page, size);
    }
}
