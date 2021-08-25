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
        ResultData<Object> resultData = checkParam(mobile, "mobile");
        if (resultData.getCode() == 404) {
            return resultData;
        }
        resultData = checkParam(password, "password");
        if (resultData.getCode() != 404) {
            return service.login(mobile, password);
        } else {
            return resultData;
        }
    }

    @GetMapping("/register")
    public ResultData<Object> register(String mobile, String password) {
        ResultData<Object> resultData = checkParam(mobile, "mobile");
        if (resultData.getCode() == 404) {
            return resultData;
        }
        resultData = checkParam(password, "password");
        if (resultData.getCode() != 404) {
            return service.register(mobile, password);
        } else {
            return resultData;
        }
    }

    @GetMapping("/getMessage")
    public ResultData<Object> getMessage(String mobile) {
        ResultData<Object> resultData = checkParam(mobile, "mobile");
        if (resultData.getCode() != 404) {
            return service.getMessage(mobile);
        } else {
            return resultData;
        }
    }

    @GetMapping("/updateMessage")
    public ResultData<Object> updateMessage(UcenterMember member) {
        ResultData<Object> resultData = checkParam(member.getMobile(), "mobile");
        if (resultData.getCode() != 404) {
            return service.updateMessage(member);
        } else {
            return resultData;
        }
    }

    @GetMapping("/updateMobile")
    public ResultData<Object> updateMobile(String oldMobile, String newMobile) {
        ResultData<Object> resultData = checkParam(oldMobile, "oldMobile");
        if (resultData.getCode() == 404) {
            return resultData;
        }
        resultData = checkParam(newMobile, "newMobile");
        if (resultData.getCode() == 404) {
            return resultData;
        }
        return service.updateMobile(oldMobile, newMobile);
    }

    @GetMapping("/updatePassword")
    public ResultData<Object> updatePassword(String mobile,String oldPassword, String newPassword) {
        ResultData<Object> resultData = checkParam(oldPassword, "oldPassword");
        if (resultData.getCode() == 404) {
            return resultData;
        }
        resultData = checkParam(newPassword, "newPassword");
        if (resultData.getCode() == 404) {
            return resultData;
        }
        return service.updatePassword(mobile,oldPassword, newPassword);
    }

    private ResultData<Object> checkParam(String param, String value) {
        ResultData<Object> resultData = new ResultData<>();
        if (param == null || param.equals("")) {
            resultData.setCode(404);
            resultData.setMsg(value + " is null, please check");
        }else {
            resultData.setCode(200);
        }
        return resultData;
    }
}
