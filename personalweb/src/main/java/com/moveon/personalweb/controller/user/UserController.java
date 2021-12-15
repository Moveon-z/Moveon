package com.moveon.personalweb.controller.user;

import com.moveon.personalweb.entity.user.User;
import com.moveon.personalweb.service.user.UserService;
import com.moveon.personalweb.util.ResultMap;
import com.moveon.personalweb.util.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Moveon
 * @Date 2021/11/6 2:18
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/getUser")
    public ResultMap getUser(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        try {
            user = userService.getUser(username, password);
        } catch (Exception e) {
            return ResultMap.buildFailureResult("系统异常请联系管理员解决");
        }
        if (user == null) {
            return ResultMap.buildFailureResult("用户名或密码错误");
        }else {
            return ResultMap.buildSuccessResult("登陆成功", user);
        }
    }

    @PostMapping("/registerUser")
    public ResultMap registerUser(@RequestBody User user) {
        user.setId(UUIDUtils.createID());
        int i = userService.registerUser(user);
        if (i == 1) {
            return ResultMap.buildSuccessResult("注册成功",i);
        }else {
            return ResultMap.buildFailureResult("注册失败");
        }
    }

    @PostMapping("/test01")
    public String test01(String id) {
        return id;
    }
}
