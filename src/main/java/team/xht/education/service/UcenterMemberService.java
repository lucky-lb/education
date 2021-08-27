package team.xht.education.service;

import team.xht.education.entity.UcenterMember;
import team.xht.education.reult.ResultData;

import javax.servlet.http.HttpServletRequest;

public interface UcenterMemberService {

    ResultData<Object> login(String username, String password, HttpServletRequest request);

    ResultData<Object> register(String mobile, String password,String name);

    ResultData<Object> getMessage(String mobile);

    ResultData<Object> updateMessage(UcenterMember member);

    ResultData<Object> updateMobile(String oldMobile, String newMobile);

    ResultData<Object> updatePassword(String mobile,String oldPassword, String newPassword);

    UcenterMember findMemberByMobile(String mobile);

    UcenterMember findMemberById(String id);
}
