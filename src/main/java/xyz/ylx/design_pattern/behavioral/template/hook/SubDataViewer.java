package xyz.ylx.design_pattern.behavioral.template.hook;

public class SubDataViewer extends DataViewer {

    // 实现父类方法：获取数据
    @Override
    public void getData() {
        System.out.println("从XML文件中获取数据。");
    }

    // 实现父类方法：显示数据
    @Override
    public void displayData() {
        System.out.println("以柱状图显示数据。");
    }

    // 覆盖父类的钩子方法
    public boolean isNotXMLData() {
        return false;
    }
}
