package xyz.ylx.design_pattern.behavioral.command.undo;

import java.util.ArrayList;
import java.util.List;

public class AddCommand extends AbstractCommand {

    private Adder adder = new Adder();
    private List<Integer> values = new ArrayList<>();

    // 实现抽象命令类中声明的execute()方法，调用加法类的加法操作
    @Override
    public int execute(int value) {
        values.add(value);
        return adder.add(value);
    }

    // 实现抽象命令类中声明的undo()方法，通过加一个相反数来实现加法的逆向操作
    @Override
    public int undo() {
        Integer value = values.remove(values.size() - 1);
        return adder.add(-value);
    }
}
