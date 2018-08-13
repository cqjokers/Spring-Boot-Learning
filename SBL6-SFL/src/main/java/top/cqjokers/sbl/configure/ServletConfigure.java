package top.cqjokers.sbl.configure;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.cqjokers.sbl.servlet.IndexServlet;

/**
 * Created by IntelliJ IDEA
 * Title: ServletConfigure
 * User: cqjokers
 * Date: 2018/8/13
 * Time: 16:14
 * Blog: https://cqjokers.top
 * Description:
 */
@Configuration
public class ServletConfigure {

    @Bean
    public ServletRegistrationBean indexServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new IndexServlet());
        bean.addUrlMappings("/index");
        return  bean;
    }
}
