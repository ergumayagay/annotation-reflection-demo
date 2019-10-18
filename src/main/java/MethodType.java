package main.java;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author emiliogumayagay
 * @version $Id: MethodType.java, v 0.1 2019-10-19 02:13 emiliogumayagay Exp $$
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodType {
    String type();
}