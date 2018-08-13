package top.cqjokers.sbl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import top.cqjokers.sbl.entity.UserInfo;
import top.cqjokers.sbl.service.UserService;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Title: UserController
 * User: cqjokers
 * Date: 2018/8/10
 * Time: 15:18
 * Blog: https://cqjokers.top
 * Description:
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public ModelAndView getUser(@PathVariable("id") int id) {
        ModelAndView view = new ModelAndView();
        UserInfo userInfo = userService.getUserById(id);
        view.addObject("user",userInfo);
        return  view;
    }

    @GetMapping("users")
    public ModelAndView getUsers(){
        ModelAndView view = new ModelAndView("user");
        List<UserInfo> userInfoList = userService.getAllUser();
        view.addObject("userList",userInfoList);
        return view;
    }
}
