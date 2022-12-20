package xyz.ylx.design_pattern.behavioral.strategy;

// 学生折扣票：具体策略类
public class StudentDiscount implements Discount {

    @Override
    public double calculate(double price) {
        System.out.println("学生票：");
        return price * 0.8;
    }
}
