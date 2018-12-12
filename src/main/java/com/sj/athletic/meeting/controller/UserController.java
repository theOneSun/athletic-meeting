package com.sj.athletic.meeting.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunjian.
 */
@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping("hello")
    public void hello(){
        System.out.println("hello");
    }
}
