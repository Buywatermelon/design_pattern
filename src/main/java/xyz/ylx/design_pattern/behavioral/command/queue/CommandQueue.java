package xyz.ylx.design_pattern.behavioral.command.queue;

import xyz.ylx.design_pattern.behavioral.command.example.Command;

import java.util.ArrayList;

public class CommandQueue {

    // 定义一个ArrayList来存储命令队列
    private ArrayList<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    // 循环调用每一个命令对象的execute()方法
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
