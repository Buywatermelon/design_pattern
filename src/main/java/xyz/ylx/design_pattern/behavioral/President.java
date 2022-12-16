package xyz.ylx.design_pattern.behavioral;

// 董事长类：具体处理类
public class President extends Approver {

    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 50000) {
            // 处理请求
            System.out.println("董事长" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "，采购目的："
                    + request.getPurpose() + "。");
        } else {
            this.successor.processRequest(request);
        }
    }
}
