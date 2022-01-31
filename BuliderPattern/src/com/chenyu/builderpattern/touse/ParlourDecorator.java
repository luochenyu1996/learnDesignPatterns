package com.chenyu.builderpattern.touse;

/**
 * 客户
 *
 * @author chen yu
 * @create 2021-12-01 17:06
 */
public class ParlourDecorator {

    public static void main(String[] args) {
        try {
            Decorator d;
            d = (Decorator) ReadXML.getObject();
            ProjectManager m = new ProjectManager(d);
            Parlour p = m.decorate();
            p.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
