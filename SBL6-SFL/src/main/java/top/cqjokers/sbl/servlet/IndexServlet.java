package top.cqjokers.sbl.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA
 * Title: IndexServlet
 * User: cqjokers
 * Date: 2018/8/13
 * Time: 16:07
 * Blog: https://cqjokers.top
 * Description:
 */
//@WebServlet(name = "IndexServlet",urlPatterns = "/index")
public class IndexServlet extends HttpServlet {

    private Logger logger = LoggerFactory.getLogger(IndexServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info(">>>>>>>>>>>>>进入IndexServlet<<<<<<<<<<<<<");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter pw = resp.getWriter();
        pw.print("这是由IndexServlet返回");
        pw.flush();
        pw.close();
    }
}
