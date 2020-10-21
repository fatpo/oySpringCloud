package com.ouyang.controller;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedissonController {


    @RequestMapping("/redisson")
    @ResponseBody
    String testRedisson() {
        Config config = new Config();
        config.useSingleServer().setAddress("127.0.0.1:6379").setPassword("123qwe");
        RedissonClient redisson = Redisson.create(config);

        RMap<String, String> map = redisson.getMap("myMap");
        RLock lock = redisson.getLock("myLock");
        return "hello";
    }
}