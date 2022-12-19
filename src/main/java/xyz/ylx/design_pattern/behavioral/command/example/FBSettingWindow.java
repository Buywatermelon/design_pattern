package xyz.ylx.design_pattern.behavioral.command.example;

import java.util.ArrayList;
import java.util.List;

// 功能键设置窗口类
public class FBSettingWindow {

    // 窗口标题
    private String title;
    // 定义一个ArrayList来存储所有功能键
    private List<FunctionButton> functionButtons = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButtons(FunctionButton fb) {
        this.functionButtons.add(fb);
    }

    public void removeFunctionButtons(FunctionButton fb) {
        this.functionButtons.remove(fb);
    }

    // 显示窗口及功能键
    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for (FunctionButton fb : functionButtons) {
            System.out.println(fb.getName());
        }
        System.out.println("----------------------------------");
    }
}
