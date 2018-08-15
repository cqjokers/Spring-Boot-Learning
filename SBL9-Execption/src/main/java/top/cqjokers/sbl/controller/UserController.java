package top.cqjokers.sbl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.cqjokers.sbl.exception.CustomExecption;

/**
 * Created by IntelliJ IDEA
 * Title: IndexController
 * User: cqjokers
 * Date: 2018/8/15
 * Time: 16:13
 * Blog: https://cqjokers.top
 * Description:
 */
@Controller
public class UserController {

    @RequestMapping("/user")
    @ResponseBody
    public Object getUser() {
        try {
            int a = 1 / 0;
        }catch (Exception e){
            throw new CustomExecption("10000","除数不能为0");
        }
        return null;
    }

    @RequestMapping("/users")
    @ResponseBody
    public Object getUsers() throws Exception{
        int a = 1 / 0;
        return null;
    }

}
