package top.cqjokers.sbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SblApplication {

    public static void main(String[] args) {
        SpringApplication.run(SblApplication.class, args);
    }
}
