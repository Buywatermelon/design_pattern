package xyz.ylx.design_pattern.behavioral.state.context;

public class Client {

    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.onClick();
        screen.onClick();
        screen.onClick();
    }
}
