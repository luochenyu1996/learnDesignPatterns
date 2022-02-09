package com.chenyu.mediatorpattern;

/**
 * 测试类
 *
 * @author chen yu
 * @create 2022-01-31 11:19
 */
public class MediatorPattern {
    public static void main(String[] args) {
        //创建一个中介者
        Mediator md = new ConcreteMediator();

        Colleague c1, c2;


        //创建两个同事
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();

        md.register(c1);
        md.register(c2);

        c1.send();
        System.out.println("-------------");
        c2.send();
    }

}
