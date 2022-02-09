package com.chenyu.mediatorpattern;

/**
 * 抽象同事
 *
 * @author chen yu
 * @create 2022-01-31 11:16
 */
public abstract   class Colleague {
    // 依赖中介者
    protected Mediator mediator;

    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void receive();

    public abstract void send();
}
