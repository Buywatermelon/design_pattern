package xyz.ylx.design_pattern.behavioral.observer;

public class ConcreteAllyControllerCenter extends AllyControllerCenter {

    public ConcreteAllyControllerCenter(String name) {
        System.out.println(allyName + "战队组件成功！");
        System.out.println("----------------");
        setAllyName(name);
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");
        for (Observer obs : players) {
            if (!obs.getName().equalsIgnoreCase(name)) {
                obs.help();
            }
        }
    }
}
