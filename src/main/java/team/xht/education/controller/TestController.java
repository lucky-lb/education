package team.xht.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import team.xht.education.service.CrmBannerService;

@RestController
public class TestController {
    @Autowired
    CrmBannerService service;

    @GetMapping("/index")
    public String index() {
        service.findAll();
        return "indexs";
    }
}
