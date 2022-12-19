package xyz.ylx.design_pattern.behavioral.observer;

public interface Observer {

    String getName();

    void setName(String name);

    void help(); // 声明支援盟友方法

    void beAttacked(AllyControllerCenter acc);
}
