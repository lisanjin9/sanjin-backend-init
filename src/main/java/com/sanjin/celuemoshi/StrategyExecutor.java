package com.sanjin.celuemoshi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @BelongsProject: sanjin-backend-init
 * @BelongsPackage: celuemoshi
 * @Author: San Jin
 * @CreateTime: 2024-07-02 20:18
 * @Version: 1.0
 */

@Service
public class StrategyExecutor {

    @Resource
    private List<Strategy> strategyList;


    public String doScore(List<Integer> list) throws Exception {

        for (Strategy strategy : strategyList) {
            if (strategy.getClass().isAnnotationPresent(StrategyConfig.class)){
                StrategyConfig annotation = strategy.getClass().getAnnotation(StrategyConfig.class);
                  if (annotation.appType() == list.get(0)){
                    return strategy.doScore(list);
                  }
            }

        }
        throw new Exception("no strategy support");
    }

}
