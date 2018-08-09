package top.cqjokers.sbl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by IntelliJ IDEA
 * Title: IndexController
 * User: cqjokers
 * Date: 2018/8/8
 * Time: 17:08
 * Blog: https://cqjokers.top
 * Description:
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public Object index() {
        return "Hello World";
    }

}
