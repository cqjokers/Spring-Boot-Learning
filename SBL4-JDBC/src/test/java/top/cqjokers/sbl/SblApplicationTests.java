package top.cqjokers.sbl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import top.cqjokers.sbl.entity.UserInfo;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=SblApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SblApplicationTests {

    private Logger logger = LoggerFactory.getLogger(SblApplication.class);

    @Autowired
    TestRestTemplate template;

    @Test
    public void getUser() {
        //查询单个
        ResponseEntity<UserInfo> responseEntity =  template.getForEntity("http://localhost:9090/user/{id}",UserInfo.class,2);
        logger.info(responseEntity.getBody().toString());

        //查询所有
        ResponseEntity<List<UserInfo>> responseEntity1 = template.exchange("http://localhost:9090/users", HttpMethod.GET, null, new ParameterizedTypeReference<List<UserInfo>>() {
        });
        logger.info(responseEntity1.getBody().toString());
    }
}
