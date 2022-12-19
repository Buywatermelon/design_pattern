package xyz.ylx.design_pattern.behavioral.state;

// 抽象状态类
public abstract class AccountState {

    protected Account acc;

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    abstract void computeInterest();

    abstract void stateCheck();
}
