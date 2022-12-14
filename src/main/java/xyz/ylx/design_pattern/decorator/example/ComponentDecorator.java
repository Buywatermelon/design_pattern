package xyz.ylx.design_pattern.decorator.example;

public class ComponentDecorator extends Component {

    private Component component; // 维持对抽象构件类型对象的引用

    // 注入抽象构件类型的对象
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
