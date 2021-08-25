package team.xht.education.service;

import team.xht.education.entity.UcenterMember;
import team.xht.education.reult.ResultData;

public interface UcenterMemberService {

    ResultData<Object> login(String username, String password);

    ResultData<Object> register(String mobile, String password);

    ResultData<Object> getMessage(String mobile);

    ResultData<Object> updateMessage(UcenterMember member);
}
