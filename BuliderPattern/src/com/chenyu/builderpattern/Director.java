package com.chenyu.builderpattern;

/**
 * 指挥者
 *
 * @author chen yu
 * @create 2021-12-01 17:03
 */
public class Director {

    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
