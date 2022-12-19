package xyz.ylx.design_pattern.behavioral.observer;

public class Player implements Observer{

    public Player(String name) {
        setName(name);
    }

    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    // 支援盟友方法的实现
    @Override
    public void help() {
        System.out.println("坚持住，" + this.getName() + "来救你！");
    }

    // 遭受攻击方法的实现，当遭受攻击时将调用战队控制中心类的通知方法 notifyObserver()来通知盟友
    @Override
    public void beAttacked(AllyControllerCenter acc) {
        System.out.println(this.getName() + "被攻击");
        acc.notifyObserver(name);
    }
}
