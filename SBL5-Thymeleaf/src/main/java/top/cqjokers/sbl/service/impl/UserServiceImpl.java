package top.cqjokers.sbl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cqjokers.sbl.dao.UserDao;
import top.cqjokers.sbl.entity.UserInfo;
import top.cqjokers.sbl.service.UserService;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Title: UserServiceImpl
 * User: cqjokers
 * Date: 2018/8/10
 * Time: 15:17
 * Blog: https://cqjokers.top
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserInfo getUserById(int id) {
        return userDao.getUser(id);
    }

    @Override
    public List<UserInfo> getAllUser() {
        return userDao.queryUsers();
    }
}
