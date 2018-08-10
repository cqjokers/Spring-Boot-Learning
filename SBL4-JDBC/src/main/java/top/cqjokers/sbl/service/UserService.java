package top.cqjokers.sbl.service;

import top.cqjokers.sbl.entity.UserInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Title: UserService
 * User: cqjokers
 * Date: 2018/8/10
 * Time: 15:16
 * Blog: https://cqjokers.top
 * Description:
 */
public interface UserService {
    UserInfo getUserById(int id);

    List<UserInfo> getAllUser();
}
