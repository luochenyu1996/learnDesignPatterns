package com.chenyu.builderpattern.touse;

/**
 * 抽象建造者
 *
 * @author chen yu
 * @create 2021-12-01 17:07
 */
public    abstract class Decorator {
    //创建产品对象
    protected Parlour product = new Parlour();
    public abstract void buildWall();
    public abstract void buildTV();
    public abstract void buildSofa();
    //返回产品对象
    public Parlour getResult() {
        return product;
    }
}
