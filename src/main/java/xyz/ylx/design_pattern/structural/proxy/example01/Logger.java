package xyz.ylx.design_pattern.structural.proxy.example01;

// 日志记录类：业务类
public class Logger {

    // 模拟实现日志记录
    public void log(String userId) {
        System.out.println("更新数据，用户‘" + userId + "’查询次数加1！");
    }
}
