package com.moveon.personalweb.util;

import java.util.UUID;

/**
 * @ClassName UUIDUtils
 * @Description TODO
 * @Author Moveon
 * @Date 2021/11/7 11:26
 * @Version 1.0
 **/
public class UUIDUtils {

    public static String createID() {
        String s = UUID.randomUUID().toString();
        String[] split = s.split("-");
        String id = "";
        for (String s1 : split) {
            id += s1;
        }
        return id;
    }
}
