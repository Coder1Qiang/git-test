package com.atguigu.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rrqstart
 * @version v1.0
 * @date 2022-05-15-下午 9:53
 * @Description
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        Integer age = 18;
        String name = "Tom";
        return "Hello Git " + age + " " + name;
    }
}
