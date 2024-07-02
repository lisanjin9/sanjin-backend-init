package com.sanjin.celuemoshi;

import java.util.List;

/**
 * @BelongsProject: sanjin-backend-init
 * @BelongsPackage: celuemoshi
 * @Author: San Jin
 * @CreateTime: 2024-07-02 20:19
 * @Version: 1.0
 */
public interface Strategy {

    String doScore(List<Integer> list) throws Exception;


}
