package xyz.ylx.design_pattern.behavioral.visitor;

// 员工类：抽象元素类
public interface Employee {

    // 接收一个抽象访问者访问
    void accept(Department handler);
}
