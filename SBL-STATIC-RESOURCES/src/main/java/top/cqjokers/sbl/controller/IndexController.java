package top.cqjokers.sbl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA
 * Title: IndexController
 * User: cqjokers
 * Date: 2018/8/9
 * Time: 10:41
 * Blog: https://cqjokers.top
 * Description:
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
