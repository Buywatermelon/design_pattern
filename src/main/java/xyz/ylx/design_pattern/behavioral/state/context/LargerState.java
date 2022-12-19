package xyz.ylx.design_pattern.behavioral.state.context;

// 2倍状态类
public class LargerState extends State {

    @Override
    void display() {
        System.out.println("2倍大小！");
    }
}
