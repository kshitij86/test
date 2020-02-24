package com.company;


// My custom annotation.
public @interface NewAnnotation {
    public String name() default "default";
    public int amount() default  45;
}
