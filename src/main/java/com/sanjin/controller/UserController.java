package com.sanjin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: sanjin-backend-init
 * @BelongsPackage: com.sanjin.controller
 * @Author: San Jin
 * @CreateTime: 2024-06-27 22:32
 * @Version: 1.0
 */
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @PostMapping("hello")
    public String hello(){
        return "hello";
    }
}
