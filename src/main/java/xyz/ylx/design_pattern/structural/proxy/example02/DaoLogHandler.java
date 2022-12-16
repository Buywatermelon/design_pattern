package xyz.ylx.design_pattern.structural.proxy.example02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DaoLogHandler implements InvocationHandler {

    private Calendar calendar;
    private Object object;

    public DaoLogHandler() {

    }

    // 自定义有参构造函数，用于注入一个需要提供代理的真是主题对象
    public DaoLogHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        Object result = method.invoke(object, args);
        afterInvoke();
        return result;
    }

    private void beforeInvoke() {
        calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String time = hour + ":" + minute + ":" + second;
        System.out.println("调用时间：" + time);
    }

    private void afterInvoke() {
        System.out.println("方法调用结束！");
    }
}
