package team.xht.education.service.serviceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import team.xht.education.reult.ResultData;
import team.xht.education.service.UcenterMemberService;
@SpringBootTest
@RunWith(SpringRunner.class)
@MapperScan("team.xht.education.dao")
public class UcenterMemberServiceImplTest {
    @Autowired
    UcenterMemberService service;
    @Test
    public void login() {
        ResultData<Object> login = service.login("13700000001", "123");
        System.out.println(login);
    }

    @Test
    public void register() {
    }
}