package com.chenyu.templatemethodpattern.touse;

/**
 * 抽象类
 *
 * @author chen yu
 * @create 2021-12-10 10:21
 */
public  abstract class StudyAbroad {
    /**
     * 模板方法
     *
     */
    public void TemplateMethod() {
        LookingForSchool(); //1.索取学校资料
        ApplyForEnrol();    //2.入学申请
        ApplyForPassport(); //3.办理因私出国护照、出境卡和公证
        ApplyForVisa();     //4.申请签证
        Arriving();         //5.体检、订机票、准备行装
        ReadyGoAbroad();    //6.抵达
    }


    //以下这些方法是通用的步骤，因此在抽象类中做具体实现

    /**
     * 抽象类中的具体实现方法3：办理因私出国护照、出境卡和公证
     *
     */
    public void ApplyForPassport() {
        System.out.println("三.办理因私出国护照、出境卡和公证：");
        System.out.println("  1）持录取通知书、本人户口簿或身份证向户口所在地公安机关申请办理因私出国护照和出境卡。");
        System.out.println("  2）办理出生公证书，学历、学位和成绩公证，经历证书，亲属关系公证，经济担保公证。");
    }

    /**
     * 抽象类中的具体实现方法4：申请签证
     *
     */
    public void ApplyForVisa() {
        System.out.println("四.申请签证：");
        System.out.println("  1）准备申请国外境签证所需的各种资料，包括个人学历、成绩单、工作经历的证明；个人及家庭收入、资金和财产证明；家庭成员的关系证明等；");
        System.out.println("  2）向拟留学国家驻华使(领)馆申请入境签证。申请时需按要求填写有关表格，递交必需的证明材料，缴纳签证。有的国家(比如美国、英国、加拿大等)在申请签证时会要求申请人前往使(领)馆进行面试。");
    }

    /**
     * 抽象类中的具体实现方法5：申请签证
     *
     */
    public void ReadyGoAbroad() {
        System.out.println("五.体检、订机票、准备行装：");
        System.out.println("  1）进行身体检查、免疫检查和接种传染病疫苗；");
        System.out.println("  2）确定机票时间、航班和转机地点。");
    }

    //以下情况要根据具体的学校进行具体的实现

    public abstract void LookingForSchool();//索取学校资料

    public abstract void ApplyForEnrol();   //入学申请

    public abstract void Arriving();        //抵达
}
