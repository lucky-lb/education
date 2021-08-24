package team.xht.education.service.serviceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import team.xht.education.service.CrmBannerService;

@SpringBootTest
@MapperScan("team.xht.education.dao")
@RunWith(SpringRunner.class)
public class CrmBannerServiceImplTest {
    @Autowired
    CrmBannerService service;

    @Test
    public void findAll() {
        service.findAll();
    }
}