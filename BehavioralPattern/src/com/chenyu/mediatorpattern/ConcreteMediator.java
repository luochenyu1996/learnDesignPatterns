package com.chenyu.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者
 *
 * @author chen yu
 * @create 2022-01-31 11:16
 */
class  ConcreteMediator  extends Mediator {

    private List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague cl) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(cl)) {
                ((Colleague) ob).receive();
            }
        }
    }
}
