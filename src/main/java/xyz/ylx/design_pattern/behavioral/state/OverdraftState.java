package xyz.ylx.design_pattern.behavioral.state;

// 透支状态：具体状态类
public class OverdraftState extends AccountState {

    public OverdraftState(AccountState state) {
        this.acc = state.acc;
    }

    @Override
    void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    @Override
    void withdraw(double amount) {
        acc.setBalance(acc.getBalance() - amount);
        stateCheck();
    }

    @Override
    void computeInterest() {
        System.out.println("计算利息");
    }

    @Override
    void stateCheck() {
        if (acc.getBalance() > 0) {
            acc.setState(new NormalState(this));
        } else if (acc.getBalance() == -2000) {
            acc.setState(new RestrictedState(this));
        } else if (acc.getBalance() < -2000) {
            System.out.println("操作受限");
        }
    }
}
