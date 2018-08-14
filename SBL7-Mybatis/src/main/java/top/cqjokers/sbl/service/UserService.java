package top.cqjokers.sbl.service;

import top.cqjokers.sbl.pojo.TUser;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Title: UserInterface
 * User: cqjokers
 * Date: 2018/8/14
 * Time: 14:31
 * Blog: https://cqjokers.top
 * Description:
 */
public interface UserService {

    List<TUser> selectUsers();

    TUser selectUser(int userId);
}
