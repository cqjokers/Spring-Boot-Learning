package top.cqjokers.sbl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public UserInfo getUser(@PathVariable("id") int id) {
        UserInfo userInfo = userService.getUserById(id);
        return  userInfo;
    }

    @GetMapping("users")
    public List<UserInfo> getUsers(){
        List<UserInfo> userInfoList = userService.getAllUser();
        return userInfoList;
    }
}
