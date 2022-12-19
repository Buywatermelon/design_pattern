package xyz.ylx.design_pattern.behavioral.mediator;

public class ConcreteMediator extends Mediator {

    // 维持对各个同事对象的引用
    protected Button addButton;
    protected List list;
    protected TextBox userNameTextBox;
    protected ComboBox cb;

    public ConcreteMediator(Button addButton, List list, TextBox userNameTextBox, ComboBox cb) {
        this.addButton = addButton;
        this.list = list;
        this.userNameTextBox = userNameTextBox;
        this.cb = cb;
    }

    // 封装同事对象之间的交互
    @Override
    public void componentChanged(Component c) {
        // 点击按钮
        if (c == addButton) {
            System.out.println("-- 单击增加按钮 --");
            list.update();
            cb.update();
            userNameTextBox.update();
        }
        // 从列表框选择客户
        else if (c == list) {
            System.out.println("-- 从列表框选择客户 --");
            cb.select();
            userNameTextBox.setText();
        }
        // 从组合框选择客户
        else if (c == cb) {
            System.out.println("-- 从组合框选择客户 --");
            cb.select();
            userNameTextBox.setText();
        }
    }
}
