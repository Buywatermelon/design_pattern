package xyz.ylx.design_pattern.behavioral.command.example;

// 最小化命令类：具体命令类
public class MinimizeCommand extends Command {

    // 维持对请求接收者的引用
    private WindowHandler handler;

    public MinimizeCommand() {
        this.handler = new WindowHandler();
    }

    // 命令执行方法，将调用请求接收者的业务方法
    @Override
    public void execute() {
        handler.display();
    }
}
