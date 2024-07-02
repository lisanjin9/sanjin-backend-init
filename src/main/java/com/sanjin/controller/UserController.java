package com.sanjin.controller;

import com.sanjin.celuemoshi.StrategyExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    @Resource
    private StrategyExecutor strategyExecutor;

    @PostMapping("hello1")
    public void hello(@RequestBody List<Integer> list , HttpServletRequest request) throws Exception {
        strategyExecutor.doScore(list);
    }
}
