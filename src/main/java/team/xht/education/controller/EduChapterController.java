package team.xht.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import team.xht.education.reult.ResultData;
import team.xht.education.service.EduChapterService;

@RestController
public class EduChapterController {
    @Autowired
    private EduChapterService service;
    @GetMapping("/findChapterByCourseId")
    public ResultData<Object>findChapterByCourseId(String id){
        return service.findChapterByCourseId(id);
    }
}
