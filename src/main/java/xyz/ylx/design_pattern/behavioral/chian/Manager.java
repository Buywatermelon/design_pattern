package xyz.ylx.design_pattern.behavioral.chian;

// 经理类：具体处理者
public class Manager extends Approver {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 8000) {
            // 处理请求
            System.out.println("经理" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "，采购目的："
                    + request.getPurpose() + "。");
        } else {
            this.successor.processRequest(request);
        }
    }
}
