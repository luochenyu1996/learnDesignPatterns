package com.chenyu.builderpattern;

/**
 * 测试用的客户类
 *
 * @author chen yu
 * @create 2021-12-01 17:03
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
