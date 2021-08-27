package team.xht.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.xht.education.reult.ResultData;
import team.xht.education.service.EduChapterService;

@CrossOrigin//用于跨域
@RestController
@RequestMapping("/chapter")
public class EduChapterController {
    @Autowired
    private EduChapterService service;

    @RequestMapping("/findChapterByCourseId")
    public ResultData<Object> findChapterByCourseId(String id) {
        return service.findChapterByCourseId(id);
    }
}
