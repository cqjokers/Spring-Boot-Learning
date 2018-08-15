package top.cqjokers.sbl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import top.cqjokers.sbl.pojo.TUser;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SblApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SblApplicationTests {


    private Logger logger = LoggerFactory.getLogger(SblApplication.class);

    @Autowired
    TestRestTemplate template;

    @Test
    public void getUser() {
        //查询单个
        ResponseEntity<TUser> responseEntity = template.getForEntity("http://localhost:9090/user/{id}", TUser.class, 2);
        logger.info(responseEntity.getBody().toString());

    }

    @Test
    public void getUsers() {

        //查询所有
        ResponseEntity<List<TUser>> responseEntity1 = template.exchange("http://localhost:9090/users", HttpMethod.GET, null, new ParameterizedTypeReference<List<TUser>>() {
        });
        logger.info(responseEntity1.getBody().toString());
    }
}
