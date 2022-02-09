package com.chenyu.mediatorpattern;

/**
 * 抽象中介者
 *
 * @author chen yu
 * @create 2022-01-31 11:15
 */
public  abstract class Mediator {

    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl); //转发
}
