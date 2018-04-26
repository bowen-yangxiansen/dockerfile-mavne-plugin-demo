package com.lvdu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 杨文波
 * @date 2018/4/25
 */
@RestController
@RequestMapping("/")
public class Hello {

    @GetMapping
    public String hello(){
        return "Hello World!";
    }
}
