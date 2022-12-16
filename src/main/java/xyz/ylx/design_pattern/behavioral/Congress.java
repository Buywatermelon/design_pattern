package xyz.ylx.design_pattern.behavioral;

// 董事会类：具体处理类
public class Congress extends Approver {

    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        // 处理请求
        System.out.println("召开董事会审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "，采购目的："
                + request.getPurpose() + "。");
    }
}
