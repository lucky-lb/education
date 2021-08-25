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
        UcenterMemberExample example = new UcenterMemberExample();
        UcenterMemberExample.Criteria criteria = example.createCriteria();
        criteria.andMobileEqualTo(mobile);
        mapper.selectByExample(example);
        List<UcenterMember> ucenterMembers = mapper.selectByExample(example);
        if (ucenterMembers.size() == 0) {
            resultData.setCode(404);
            resultData.setMsg("user don't exist");
            return resultData;
        }

        criteria.andPasswordEqualTo(password);
        ucenterMembers = mapper.selectByExample(example);
        if (ucenterMembers.size() != 0) {
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
    public ResultData<Object> register(String mobile, String password) {
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
        UcenterMemberExample example = new UcenterMemberExample();
        UcenterMemberExample.Criteria criteria = example.createCriteria();
        criteria.andMobileEqualTo(mobile);
        List<UcenterMember> list = mapper.selectByExample(example);
        if (list.size() == 0) {
            resultData.setCode(404);
            resultData.setMsg("don't find user: " + mobile);
        } else {
            resultData.setCode(200);
            resultData.setMsg("find success");
            UcenterMember member = list.get(0);
            member.setPassword(null);
            resultData.setData(member);
        }
        return resultData;
    }

    @Override
    @Transactional
    public ResultData<Object> updateMessage(UcenterMember member) {
        member.setPassword(null);
        ResultData<Object> resultData = new ResultData<>();
        UcenterMemberExample example = new UcenterMemberExample();
        UcenterMemberExample.Criteria criteria = example.createCriteria();
        criteria.andMobileEqualTo(member.getMobile());
        List<UcenterMember> ucenterMembers = mapper.selectByExample(example);
        if (ucenterMembers.size() == 0) {
            resultData.setCode(404);
            resultData.setMsg("find user error");
            return resultData;
        }
        UcenterMember primer = ucenterMembers.get(0);
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

}
