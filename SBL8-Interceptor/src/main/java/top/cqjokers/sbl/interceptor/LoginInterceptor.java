package top.cqjokers.sbl.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA
 * Title: LoginInterceptor
 * User: cqjokers
 * Date: 2018/8/15
 * Time: 10:02
 * Blog: https://cqjokers.top
 * Description:
 */
public class LoginInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info(">>>>>>>>>>>>>>preHandle<<<<<<<<<<<<<<<<");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info(">>>>>>>>>>>>>>postHandle<<<<<<<<<<<<<<<<");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info(">>>>>>>>>>>>>>afterCompletion<<<<<<<<<<<<<<<<");
    }
}
