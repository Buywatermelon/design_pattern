package xyz.ylx.design_pattern.behavioral.chian;

// 副董事长类：具体处理类
public class VicePresident extends Approver {

    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 10000) {
            // 处理请求
            System.out.println("副董事长" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "，采购目的："
                    + request.getPurpose() + "。");
        } else {
            this.successor.processRequest(request);
        }
    }
}
