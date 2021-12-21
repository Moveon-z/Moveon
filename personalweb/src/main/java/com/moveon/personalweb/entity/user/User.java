package com.moveon.personalweb.entity.user;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Description TODO
 * @Author Moveon
 * @Date 2021/11/6 2:19
 * @Version 1.0
 **/
@Data
public class User implements Serializable {

    private String id;
    private String username;
    private String password;
    private String name;
    private String email;
    private Integer phone;
    private Date createDate;
    private Date updateDate;
    private String isDeleted;
}
