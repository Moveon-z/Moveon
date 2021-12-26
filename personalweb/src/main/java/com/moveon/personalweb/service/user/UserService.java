package com.moveon.personalweb.service.user;

import com.moveon.personalweb.dao.user.UserDao;
import com.moveon.personalweb.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @ClassName UserService
 * @Description TODO
 * @Author Moveon
 * @Date 2021/11/6 2:19
 * @Version 1.0
 **/
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public User getUser(String username, String password) {
        return userDao.getUser(username,password);
    }

    public int registerUser(User user) {
        return userDao.registerUser(user);
    }

    public User getUserById(String userId) {
        return userDao.getUserById(userId);
    }

    public int getUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }

}
