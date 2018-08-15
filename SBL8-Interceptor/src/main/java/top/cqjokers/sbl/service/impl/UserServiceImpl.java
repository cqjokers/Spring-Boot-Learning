package top.cqjokers.sbl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cqjokers.sbl.mapper.TUserMapper;
import top.cqjokers.sbl.pojo.TUser;
import top.cqjokers.sbl.service.UserService;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Title: UserInterfaceImpl
 * User: cqjokers
 * Date: 2018/8/14
 * Time: 14:32
 * Blog: https://cqjokers.top
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TUserMapper userMapper;

    @Override
    public List<TUser> selectUsers() {
        return userMapper.selectUsers();
    }

    @Override
    public TUser selectUser(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
