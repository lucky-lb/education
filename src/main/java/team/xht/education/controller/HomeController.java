package team.xht.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.xht.education.reult.ResultData;
import team.xht.education.service.CrmBannerService;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    CrmBannerService service;
    @GetMapping("/index")
    public ResultData<Object> index(){
        List<String> banners= service.findAll().getData();
        return null;
    }
}
