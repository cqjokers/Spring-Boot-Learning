package top.cqjokers.sbl.configure;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.cqjokers.sbl.filter.LoginFilter;

/**
 * Created by IntelliJ IDEA
 * Title: FilterConfigure
 * User: cqjokers
 * Date: 2018/8/13
 * Time: 16:55
 * Blog: https://cqjokers.top
 * Description:
 */
@Configuration
public class FilterConfigure {

    @Bean
    public FilterRegistrationBean loginFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.addUrlPatterns("/*");
        bean.setFilter(new LoginFilter());
        return bean;
    }

}
