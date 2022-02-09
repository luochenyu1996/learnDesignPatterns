package com.chenyu.mediatorpattern;

/**
 * 具体同事
 *
 * @author chen yu
 * @create 2022-01-31 11:17
 */
public class ConcreteColleague1 extends Colleague{


    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
