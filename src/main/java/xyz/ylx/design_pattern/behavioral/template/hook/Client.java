package xyz.ylx.design_pattern.behavioral.template.hook;

public class Client {

    public static void main(String[] args) {
        DataViewer dv;
        dv = new SubDataViewer();
        dv.process();
    }
}
