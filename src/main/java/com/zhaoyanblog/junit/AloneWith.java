package com.zhaoyanblog.junit;

import org.junit.runner.Runner;

import java.lang.annotation.*;

/**
 * Real Runner
 *
 * @author johnyannj
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface AloneWith {
    Class<? extends Runner> value();
}
