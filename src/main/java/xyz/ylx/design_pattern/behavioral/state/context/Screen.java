package xyz.ylx.design_pattern.behavioral.state.context;

// 屏幕类
public class Screen {

    // 枚举所有的状态，currentState表示当前状态
    private State currentState, normalState, largerState, largestState;

    public Screen() {
        this.normalState = new NormalState();
        this.largerState = new LargerState();
        this.largestState = new LargestState();

        this.currentState = normalState;
        this.currentState.display();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    // 单机事件处理方法，封装了对状态类中业务方法的调用和状态的转换
    public void onClick() {
        if (this.currentState == normalState) {
            this.setState(largerState);
            this.currentState.display();
        } else if (this.currentState == largerState) {
            this.setState(largestState);
            this.currentState.display();
        } else if (this.currentState == largestState) {
            this.setState(normalState);
            this.currentState.display();
        }
    }
}
