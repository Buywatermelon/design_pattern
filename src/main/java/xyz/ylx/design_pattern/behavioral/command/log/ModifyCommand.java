package xyz.ylx.design_pattern.behavioral.command.log;

// 修改命令类：具体命令
public class ModifyCommand extends Command {

    public ModifyCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    @Override
    public void execute() {
        this.args = args;
        configOperator.modify(args);
    }
}
