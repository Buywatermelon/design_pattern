package xyz.ylx.design_pattern.behavioral.mediator;

// 新增具体中介者类
public class SubConcreteMediator extends ConcreteMediator {

    // 增加对Label对象的引用
    private Label label;

    public SubConcreteMediator(Label label, Button addButton, List list, TextBox userNameTextBox, ComboBox cb) {
        super(addButton, list, userNameTextBox, cb);
        this.label = label;
    }

    @Override
    public void componentChanged(Component c) {
        // 单机按钮
        if (c == addButton) {
            System.out.println("-- 单机增加按钮 --");
            list.update();
            cb.update();
            userNameTextBox.update();
            label.update(); // 文本标签更新
        }
        // 从列表框选择客户
        else if (c == list) {
            System.out.println("-- 从列表框选择客户 --");
            cb.select();
            userNameTextBox.setText();
        }
        // 从组合框选择客户
        else if (c == cb) {
            System.out.println("-- 从组合框选择客户");
            cb.select();
            userNameTextBox.setText();
        }
    }
}
