package com.she.gitdemo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zfshe
 * @date 2020/4/17 15:15
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello Git";
    }
    
    @RequestMapping(value = "/hello1")
    public String hello1(){
        return "hello Git1";
    }

     @RequestMapping(value = "/hello2")
    public String hello2(){
        return "hello Git2";
    }

    @RequestMapping(value = "/hello3")
    public String hello3(){
        return "hello Git3";
    }
}
