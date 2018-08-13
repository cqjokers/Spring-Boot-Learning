package top.cqjokers.sbl.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA
 * Title: LoginFilter
 * User: cqjokers
 * Date: 2018/8/13
 * Time: 16:21
 * Blog: https://cqjokers.top
 * Description:
 */
@WebFilter(urlPatterns = "/*",filterName = "loginFilter")
public class LoginFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(LoginFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info(">>>>>>>>>>>LoginFilter init...<<<<<<<<<<<<<");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info(">>>>>>>>>>>LoginFilter doFilter...<<<<<<<<<<<<<<");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
