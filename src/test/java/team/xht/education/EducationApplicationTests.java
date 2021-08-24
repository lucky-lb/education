package team.xht.education;

import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@MapperScan("team.xht.education.dao")
@RunWith(SpringRunner.class)
public class EducationApplicationTests {

}
