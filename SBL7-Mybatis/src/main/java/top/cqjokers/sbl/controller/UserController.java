package top.cqjokers.sbl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.cqjokers.sbl.pojo.TUser;
import top.cqjokers.sbl.service.UserService;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Title: UserController
 * User: cqjokers
 * Date: 2018/8/14
 * Time: 14:35
 * Blog: https://cqjokers.top
 * Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public Object getUsers() {
        List<TUser> userList = userService.selectUsers();
        return userList;
    }

    @RequestMapping("/user/{id}")
    public Object getUser(@PathVariable("id") int userId){
        return userService.selectUser(userId);
    }

}
