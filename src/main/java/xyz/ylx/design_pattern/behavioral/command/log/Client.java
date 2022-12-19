package xyz.ylx.design_pattern.behavioral.command.log;

public class Client {

    public static void main(String[] args) {
        // 定义请求发送者
        ConfigSettingWindow csw = new ConfigSettingWindow();
        // 定义命令对象
        Command command;
        // 定义请求接收者
        ConfigOperator co = new ConfigOperator();

        command = new InsertCommand("增加");
        command.setConfigOperator(co);
        csw.setCommand(command);
        csw.call("网站首页");

        command = new InsertCommand("增加");
        command.setConfigOperator(co);
        csw.setCommand(command);
        csw.call("端口号");

        command = new ModifyCommand("修改");
        command.setConfigOperator(co);
        csw.setCommand(command);
        csw.call("网站首页");

        command = new ModifyCommand("修改");
        command.setConfigOperator(co);
        csw.setCommand(command);
        csw.call("端口号");

        System.out.println("----------------------");
        System.out.println("保存配置");
        csw.save();

        System.out.println("----------------------");
        System.out.println("恢复配置");
        csw.recover();
    }
}
