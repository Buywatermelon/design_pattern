package xyz.ylx.design_pattern.behavioral.template;

// 定期账户类：具体子类
public class SavingAccount {

    // 覆盖父类的抽象基本方法
    public void calculateInterest() {
        System.out.println("按定期利率计算利息");
    }
}
