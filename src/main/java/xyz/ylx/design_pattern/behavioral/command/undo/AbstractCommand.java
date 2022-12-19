package xyz.ylx.design_pattern.behavioral.command.undo;

// 抽象命令类
public abstract class AbstractCommand {

    // 声明命令执行方法execute()
    public abstract int execute(int value);

    // 声明撤销方法undo()
    public abstract int undo();
}
