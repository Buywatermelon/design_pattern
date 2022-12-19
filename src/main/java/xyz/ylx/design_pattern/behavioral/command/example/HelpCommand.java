package xyz.ylx.design_pattern.behavioral.command.example;

public class HelpCommand extends Command {

    // 维持对请求接收者的引用
    private HelpHandler handler;

    public HelpCommand() {
        handler = new HelpHandler();
    }

    // 命令执行方法，，将调用请求接收者的业务方法
    @Override
    public void execute() {
        handler.display();
    }
}
