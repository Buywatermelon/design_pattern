package xyz.ylx.design_pattern.behavioral.visitor;

// 人力资源部类：具体访问者类
public class HRDepartment extends Department {

    // 实现人力资源部对全职员工的访问
    @Override
    public void visit(FulltimeEmployee employee) {
        // 实现人力资源部对全职员工的访问
        int workTime = employee.getWorkTime();
        System.out.println("正式员工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
        if (workTime > 40) {
            System.out.println("正式员工" + employee.getName() + "加班时间为：" + (workTime - 40) + "小时。");
        } else if (workTime < 40) {
            System.out.println("正式员工" + employee.getName() + "请假时间为：" + (40 - workTime) + "小时。");
        }
    }

    // 实现人力资源对兼职员工的访问
    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("兼职员工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
    }
}
