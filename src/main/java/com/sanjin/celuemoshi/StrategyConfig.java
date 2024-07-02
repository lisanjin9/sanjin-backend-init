package com.sanjin.celuemoshi;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @BelongsProject: sanjin-backend-init
 * @BelongsPackage: celuemoshi
 * @Author: San Jin
 * @CreateTime: 2024-07-02 20:02
 * @Version: 1.0
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface StrategyConfig {

    int appType();

    int strategy();

}
