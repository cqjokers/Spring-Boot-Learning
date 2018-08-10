package top.cqjokers.sbl.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import top.cqjokers.sbl.dao.UserDao;
import top.cqjokers.sbl.entity.UserInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Title: UserDaoImpl
 * User: cqjokers
 * Date: 2018/8/10
 * Time: 15:10
 * Blog: https://cqjokers.top
 * Description:
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public UserInfo getUser(int id) {
        String sql = "select * from t_user where id= ?";
        UserInfo userInfo = jdbcTemplate.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<>(UserInfo.class));
        return userInfo;
    }

    @Override
    public List<UserInfo> queryUsers() {
        String sql = "select * from t_user";
        List<UserInfo> userInfoList = jdbcTemplate.query(sql,new Object[]{},new BeanPropertyRowMapper<>(UserInfo.class));
        return userInfoList;
    }
}
