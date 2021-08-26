package team.xht.education.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team.xht.education.dao.UcenterMemberMapper;
import team.xht.education.entity.UcenterMember;
import team.xht.education.entity.UcenterMemberExample;
import team.xht.education.reult.ResultData;
import team.xht.education.service.UcenterMemberService;
import team.xht.education.util.DateAndLocal;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UcenterMemberServiceImpl implements UcenterMemberService {
    @Autowired
    UcenterMemberMapper mapper;

    @Override
    public ResultData<Object> login(String mobile, String password) {
        ResultData<Object> resultData = new ResultData<>();
        UcenterMember member = findMemberByMobile(mobile);
        if (member == null) {
            resultData.setCode(404);
            resultData.setMsg("user don't exist");
            return resultData;
        }
        if (member.getPassword().equals(password)) {
            resultData.setCode(200);
            resultData.setMsg("login success");
        } else {
            resultData.setCode(500);
            resultData.setMsg("password error");
        }
        return resultData;
    }

    @Override
    @Transactional
    public ResultData<Object> register(String mobile, String password,String name) {
        ResultData<Object> resultData = new ResultData<>();
        UcenterMemberExample example = new UcenterMemberExample();
        UcenterMemberExample.Criteria criteria = example.createCriteria();
        criteria.andMobileEqualTo(mobile);
        List<UcenterMember> list = mapper.selectByExample(example);
        if (list.size() > 0) {
            resultData.setCode(200);
            resultData.setMsg("mobile has been used");
            return resultData;
        }
        UcenterMember member = new UcenterMember();
        member.setMobile(mobile);
        member.setPassword(password);
        member.setNickname(name);
        member.setId(UUID.randomUUID().toString().substring(0, 18));
        member.setIsDeleted(false);
        member.setIsDisabled(false);
        member.setGmtCreate(DateAndLocal.asLocal(new Date()));
        member.setGmtModified(DateAndLocal.asLocal(new Date()));
        try {
            mapper.insert(member);
            resultData.setCode(200);
            resultData.setMsg("register success");
        } catch (Exception e) {
            resultData.setCode(500);
            resultData.setMsg("creat user failed");
            e.printStackTrace();
        }
        return resultData;
    }

    @Override
    public ResultData<Object> getMessage(String mobile) {
        ResultData<Object> resultData = new ResultData<>();
        UcenterMember member = findMemberByMobile(mobile);
        if (member == null) {
            resultData.setCode(404);
            resultData.setMsg("don't find user: " + mobile);
            return resultData;
        }
        resultData.setCode(200);
        resultData.setMsg("find success");
        member.setPassword(null);
        resultData.setData(member);
        return resultData;
    }

    @Override
    @Transactional
    public ResultData<Object> updateMessage(UcenterMember member) {
        member.setPassword(null);
        ResultData<Object> resultData = new ResultData<>();
        UcenterMember primer = findMemberByMobile(member.getMobile());
        if (primer == null) {
            resultData.setCode(404);
            resultData.setMsg("find user error");
            return resultData;
        }
        member.setId(primer.getId());
        member.setGmtModified(DateAndLocal.asLocal(new Date()));
        try {
            mapper.updateByPrimaryKeySelective(member);//只更新有值的项
            resultData.setCode(200);
            resultData.setMsg("update success");
            System.out.println(member);
            resultData.setData(member + "---" + mapper.selectByPrimaryKey(member.getId()));
        } catch (Exception e) {
            e.printStackTrace();
            resultData.setCode(500);
            resultData.setMsg("update error");
        }
        return resultData;
    }

    @Override
    @Transactional
    public ResultData<Object> updateMobile(String oldMobile, String newMobile) {
        ResultData<Object> resultData = new ResultData<>();
        UcenterMember member = findMemberByMobile(oldMobile);
        if (member == null) {
            resultData.setCode(404);
            resultData.setMsg("find mobile error");
            return resultData;
        }
        UcenterMember newMember = new UcenterMember();
        newMember.setId(member.getId());
        newMember.setMobile(newMobile);
        newMember.setGmtModified(DateAndLocal.asLocal(new Date()));
        try {
            mapper.updateByPrimaryKeySelective(newMember);
            resultData.setCode(200);
            resultData.setMsg("update mobile success");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultData;
    }

    @Override
    @Transactional
    public ResultData<Object> updatePassword(String mobile, String oldPassword, String newPassword) {
        ResultData<Object> resultData = new ResultData<>();
        UcenterMember member = findMemberByMobile(mobile);
        if (member==null) {
            resultData.setCode(404);
            resultData.setMsg("find mobile error");
            return resultData;
        }
        if (!member.getPassword().equals(oldPassword)) {
            resultData.setCode(404);
            resultData.setMsg("oldPassword is error");
            return resultData;
        }
        UcenterMember newMember = new UcenterMember();
        newMember.setId(member.getId());
        newMember.setPassword(newPassword);
        newMember.setGmtModified(DateAndLocal.asLocal(new Date()));
        try {
            mapper.updateByPrimaryKeySelective(newMember);
            resultData.setCode(200);
            resultData.setMsg("update password success");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultData;
    }

    private UcenterMember findMemberByMobile(String mobile) {
        ResultData<Object> resultData = new ResultData<>();
        UcenterMemberExample example = new UcenterMemberExample();
        UcenterMemberExample.Criteria criteria = example.createCriteria();
        criteria.andMobileEqualTo(mobile);
        List<UcenterMember> list = mapper.selectByExample(example);
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }
}
