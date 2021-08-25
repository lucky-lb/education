package team.xht.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.xht.education.entity.UcenterMember;
import team.xht.education.reult.ResultData;
import team.xht.education.service.UcenterMemberService;

@CrossOrigin//用于跨域
@RestController
@RequestMapping("/user")
public class UcenterMemberController {
    @Autowired
    private UcenterMemberService service;

    @GetMapping("/login")
    public ResultData<Object> login(String mobile, String password) {
        ResultData<Object> resultData = checkMobileAndPassword(mobile, password);
        if (resultData.getCode() == 200) {
            return service.login(mobile, password);
        } else {
            return resultData;
        }
    }

    @GetMapping("/register")
    public ResultData<Object> register(String mobile, String password) {
        ResultData<Object> resultData = checkMobileAndPassword(mobile, password);
        if (resultData.getCode() == 200) {
            return service.register(mobile, password);
        } else {
            return resultData;
        }
    }

    @GetMapping("/getMessage")
    public ResultData<Object> getMessage(String mobile) {
        ResultData<Object> resultData = checkMobileAndPassword(mobile,"0");
        if (resultData.getCode() == 200) {
            return service.getMessage(mobile);
        } else {
            return resultData;
        }
    }
    @GetMapping("/updateMessage")
    public ResultData<Object> updateMessage(UcenterMember member) {
        ResultData<Object> resultData = checkMobileAndPassword(member.getMobile(),"0");
        if (resultData.getCode() == 200) {
            return service.updateMessage(member);
        } else {
            return resultData;
        }
    }

    private ResultData<Object> checkMobileAndPassword(String mobile, String password) {
        ResultData<Object> resultData = new ResultData<>();
        if (mobile == null || mobile.equals("")) {
            resultData.setCode(404);
            resultData.setMsg("mobile is null, please check");
        } else if (password == null || password.equals("")) {
            resultData.setCode(404);
            resultData.setMsg("password is null, please check");
        } else {
            resultData.setCode(200);
        }
        return resultData;
    }
}
