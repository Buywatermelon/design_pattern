package xyz.ylx.design_pattern.behavioral.template;

public class CurrentAccount extends Account {

    // 覆盖父类的抽象基本方法
    @Override
    public void calculateInterest() {
        System.out.println("按活期利率计算利息！");
    }
}
