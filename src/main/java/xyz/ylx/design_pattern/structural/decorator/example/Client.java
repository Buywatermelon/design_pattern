package xyz.ylx.design_pattern.structural.decorator.example;

public class Client {

    public static void main(String[] args) {
        Component component, componentSB;
        component = new Window();

        componentSB = new ScrollBarDecorator(component);
        BlackBorderDecorator componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();
    }
}
