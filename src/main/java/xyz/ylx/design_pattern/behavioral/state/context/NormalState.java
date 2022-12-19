package xyz.ylx.design_pattern.behavioral.state.context;

// 正常状态类
public class NormalState extends State {

    @Override
    void display() {
        System.out.println("正常大小！");
    }
}
