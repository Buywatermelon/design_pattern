package xyz.ylx.design_pattern.behavioral.state.share;

public class OnState extends State {

    @Override
    void on(Switch s) {
        System.out.println("已经打开！");
    }

    @Override
    void off(Switch s) {
        System.out.println("关闭！");
        s.setState(Switch.getState("off"));
    }
}
