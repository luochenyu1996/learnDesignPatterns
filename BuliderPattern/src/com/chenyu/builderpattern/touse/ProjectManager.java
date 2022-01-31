package com.chenyu.builderpattern.touse;

/**
 * 项目经理 --指挥者
 *
 * @author chen yu
 * @create 2021-12-01 17:10
 */
public class ProjectManager {

    private Decorator builder;
    public ProjectManager(Decorator builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Parlour decorate() {
        builder.buildWall();
        builder.buildTV();
        builder.buildSofa();
        return builder.getResult();
    }
}
