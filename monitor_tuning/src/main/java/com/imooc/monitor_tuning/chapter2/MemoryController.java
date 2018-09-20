package com.imooc.monitor_tuning.chapter2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class MemoryController {

    private List<User> userList = new ArrayList<>();


    /**
     *  -Xmx32M -Xms32M
     * @return
     */
    @GetMapping("/heap")
    public String heap() {
        int i = 0;
        while (true) {
            userList.add(new User(i++, UUID.randomUUID().toString()));
        }

    }
}
