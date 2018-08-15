package top.cqjokers.sbl.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.cqjokers.sbl.pojo.TUser;

import java.util.List;

@Mapper
public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    @Select("select * from t_user")
    List<TUser> selectUsers();
}