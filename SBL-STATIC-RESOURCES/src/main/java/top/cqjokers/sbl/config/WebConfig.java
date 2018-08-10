package top.cqjokers.sbl.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by IntelliJ IDEA
 * Title: ResourceConfig
 * User: cqjokers
 * Date: 2018/8/9
 * Time: 17:11
 * Blog: https://cqjokers.top
 * Description:
 */
@Configuration
@EnableWebMvc
@EnableLoadTimeWeaving
public class WebConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/**").addResourceLocations("classpath:/img/");
        registry.addResourceHandler("/image/**").addResourceLocations("classpath:/image/");
        super.addResourceHandlers(registry);
    }

    @Override
    protected void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/",".jsp");
        super.configureViewResolvers(registry);
    }
}
