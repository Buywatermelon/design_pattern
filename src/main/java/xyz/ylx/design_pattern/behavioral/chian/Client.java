package xyz.ylx.design_pattern.behavioral.chian;

public class Client {

    public static void main(String[] args) {
        Approver wjzhang, rhuang, gyang, jguo, meeting;
        wjzhang = new Director("张无忌");
        rhuang = new Manager("黄蓉");
        gyang = new VicePresident("杨过");
        jguo = new President("郭靖");
        meeting = new Congress("董事会");

        // 创建职责链
        wjzhang.setSuccessor(rhuang);
        rhuang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);

        // 创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(4500, 10001, "购买倚天剑");
        wjzhang.processRequest(pr1);

        PurchaseRequest pr2 = new PurchaseRequest(6000, 10002, "购买屠龙刀");
        wjzhang.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(16000, 10003, "购买九阳真经");
        wjzhang.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(110000, 10004, "购买桃花岛");
        wjzhang.processRequest(pr4);
    }
}
