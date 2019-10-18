/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package main.java;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author emiliogumayagay
 * @version $Id: About.java, v 0.1 2019-10-10 15:55 emiliogumayagay Exp $$
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface About {
    String author();
    String  description();
}