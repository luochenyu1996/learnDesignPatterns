package com.chenyu.simplefactorypattern;

/**
 * 简单工厂
 *
 *
 * @author chen yu
 * @create 2021-12-02 11:42
 */
public class Client {


    public static void main(String[] args) {
        Product product = SimpleFactory.makeProduct(1);
    }



}
