package com.moveon.personalweb.dao.user;

import com.moveon.personalweb.entity.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author Moveon
 * @Date 2021/11/6 2:19
 * @Version 1.0
 **/
@Mapper
public interface UserDao {

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getAllUsers();

    /**
     * 通过用户名和用户密码获取用户信息
     * @param username
     * @param password
     * @return
     */
    User getUser(String username, String password);

    /**
     * 用户注册
     * @param user
     * @return
     */
    int registerUser(User user);
}
