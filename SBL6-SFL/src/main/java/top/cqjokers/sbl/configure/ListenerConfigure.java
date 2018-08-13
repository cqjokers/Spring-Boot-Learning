package top.cqjokers.sbl.configure;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.cqjokers.sbl.listener.IndexListener;

/**
 * Created by IntelliJ IDEA
 * Title: ListenerConfigure
 * User: cqjokers
 * Date: 2018/8/13
 * Time: 16:59
 * Blog: https://cqjokers.top
 * Description:
 */
@Configuration
public class ListenerConfigure {

    @Bean
    public ServletListenerRegistrationBean indexListener() {
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean();
        bean.setListener(new IndexListener());
        return bean;
    }
}
