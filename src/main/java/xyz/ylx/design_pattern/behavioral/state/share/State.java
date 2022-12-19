package xyz.ylx.design_pattern.behavioral.state.share;

public abstract class State {

    abstract void on(Switch s);

    abstract void off(Switch s);
}
