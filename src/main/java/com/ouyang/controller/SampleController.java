package com.ouyang.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 官方示例工程中的测试代码
 */
@RestController
public class SampleController {

    @GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String index() {

        return "Hello there";
    }
}
