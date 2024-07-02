package com.sanjin.celuemoshi;

import java.util.List;

/**
 * @BelongsProject: sanjin-backend-init
 * @BelongsPackage: celuemoshi
 * @Author: San Jin
 * @CreateTime: 2024-07-02 20:21
 * @Version: 1.0
 */
@StrategyConfig(appType = 1, strategy = 1)
public class StrategyDemo01 implements Strategy{
    @Override
    public String doScore(List list) throws Exception {
        System.out.println("执行策略01");
        return null;
    }
}
