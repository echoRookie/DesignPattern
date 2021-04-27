package StrategyPattern.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author yangjun6
 * @date 2021-04-27 11:58
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface PriceAnnotion {
    int max();
    int min();
}
