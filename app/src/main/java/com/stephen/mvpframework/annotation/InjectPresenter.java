package com.stephen.mvpframework.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Presenter注入注解
 * Created by Stephen on 2017/10/16.
 * StephenYoung0406@hotmail.com
 * <(￣ c￣)y▂ξ
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InjectPresenter {
}