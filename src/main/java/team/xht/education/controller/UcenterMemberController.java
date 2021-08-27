package team.xht.education.controller;

import com.alibaba.druid.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.xht.education.entity.UcenterMember;
import team.xht.education.reult.ResultData;
import team.xht.education.service.UcenterMemberService;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin//用于跨域
@RestController
@RequestMapping("/user")
public class UcenterMemberController {
    @Autowired
    private UcenterMemberService service;

    @RequestMapping("/login")
    public ResultData<Object> login(String mobile, String password, HttpServletRequest request) {
        ResultData<Object> resultData = checkParam(mobile, "mobile");
        if (resultData.getCode() == 404) {
            return resultData;
        }
        resultData = checkParam(password, "password");
        if (resultData.getCode() != 404) {
            return service.login(mobile, password, request);
        } else {
            return resultData;
        }
    }

    @RequestMapping("/register")
    public ResultData<Object> register(String mobile, String password, String name) {
        ResultData<Object> resultData = checkParam(mobile, "mobile");
        if (resultData.getCode() == 404) {
            return resultData;
        }
        resultData = checkParam(password, "password");
        if (resultData.getCode() != 404) {
            return service.register(mobile, password, name);
        } else {
            return resultData;
        }
    }

    @RequestMapping("/getMessage")
    public ResultData<Object> getMessage(String mobile) {
        ResultData<Object> resultData = checkParam(mobile, "mobile");
        if (resultData.getCode() != 404) {
            return service.getMessage(mobile);
        } else {
            return resultData;
        }
    }

    @RequestMapping("/updateMessage")
    public ResultData<Object> updateMessage(UcenterMember member) {
        ResultData<Object> resultData = checkParam(member.getMobile(), "mobile");
        if (resultData.getCode() != 404) {
            return service.updateMessage(member);
        } else {
            return resultData;
        }
    }

    @RequestMapping("/updateMobile")
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

    @RequestMapping("/updatePassword")
    public ResultData<Object> updatePassword(String mobile, String oldPassword, String newPassword) {
        ResultData<Object> resultData = checkParam(oldPassword, "oldPassword");
        if (resultData.getCode() == 404) {
            return resultData;
        }
        resultData = checkParam(newPassword, "newPassword");
        if (resultData.getCode() == 404) {
            return resultData;
        }
        return service.updatePassword(mobile, oldPassword, newPassword);
    }

    @RequestMapping("/updateAvatar")
    public ResultData<Object> updateAvatar(UcenterMember ucenterMember) {
        return service.updateAvatar(ucenterMember);
    }


    private ResultData<Object> checkParam(String param, String value) {
        ResultData<Object> resultData = new ResultData<>();
        if (StringUtils.isEmpty(param)) {
            resultData.setCode(404);
            resultData.setMsg(value + " is null, please check");
        } else {
            resultData.setCode(200);
        }
        return resultData;
    }
}
