package com.moveon.personalweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class PersonalwebApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void createId() {
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        String uid = "";
        String[] ids = s.split("-");
        for (String id : ids) {
            uid += id;
        }
        System.out.println(uid);
    }

}
