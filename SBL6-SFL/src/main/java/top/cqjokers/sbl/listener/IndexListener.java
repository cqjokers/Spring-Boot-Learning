package top.cqjokers.sbl.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by IntelliJ IDEA
 * Title: WebListener
 * User: cqjokers
 * Date: 2018/8/13
 * Time: 16:45
 * Blog: https://cqjokers.top
 * Description:
 */
//@WebListener
public class IndexListener implements ServletContextListener {
    private Logger logger = LoggerFactory.getLogger(IndexListener.class);
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info(">>>>>>>>>>>>>>>IndexListener contextInitialized<<<<<<<<<<<<<<<<<<<");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info(">>>>>>>>>>>>>>>IndexListener contextDestroyed<<<<<<<<<<<<<<<<<<<");
    }
}

