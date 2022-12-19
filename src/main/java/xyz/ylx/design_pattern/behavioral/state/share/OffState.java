package xyz.ylx.design_pattern.behavioral.state.share;

public class OffState extends State {

    @Override
    void on(Switch s) {
        System.out.println("打开！");
        s.setState(Switch.getState("on"));
    }

    @Override
    void off(Switch s) {
        System.out.println("已经关闭！");
    }
}
