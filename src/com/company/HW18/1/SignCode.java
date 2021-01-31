package com.company.HW18;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SignCode {
    com.company.HW18.Type type();

    int id();
}
