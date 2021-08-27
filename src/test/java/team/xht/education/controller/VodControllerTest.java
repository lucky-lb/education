package team.xht.education.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import team.xht.education.reult.R;

/**
 * @Author Miracle Luna
 * @Date 2021/8/27 9:49
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class VodControllerTest {
    @Autowired
    private VodController vodController;
    @Test
    public void tsetgetPlayAuth(){
        String s="392e435b8e794b2e8cf5bbaa8a5850ca";
        R r=vodController.getPlayAuth(s);
        System.out.println(r);
    }
}