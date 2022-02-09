package com.chenyu.builderpattern;

/**
 * 抽象建造者
 *
 * @author chen yu
 * @create 2021-12-01 17:02
 */
public abstract class Builder {
    //创建产品对象
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getResult() {
        return product;
    }
}
