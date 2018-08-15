package top.cqjokers.sbl.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import top.cqjokers.sbl.interceptor.LoginInterceptor;

/**
 * Created by IntelliJ IDEA
 * Title: InterceptorConfigure
 * User: cqjokers
 * Date: 2018/8/15
 * Time: 10:07
 * Blog: https://cqjokers.top
 * Description:
 */
@Configuration
public class InterceptorConfigure extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/users");
        super.addInterceptors(registry);
    }
}
