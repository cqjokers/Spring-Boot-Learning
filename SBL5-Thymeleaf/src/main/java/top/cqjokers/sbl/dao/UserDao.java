package top.cqjokers.sbl.dao;

import top.cqjokers.sbl.entity.UserInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Title: UserDao
 * User: cqjokers
 * Date: 2018/8/10
 * Time: 15:06
 * Blog: https://cqjokers.top
 * Description:
 */
public interface UserDao {

    UserInfo getUser(int id);

    List<UserInfo> queryUsers();
}
