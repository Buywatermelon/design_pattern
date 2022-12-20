package xyz.ylx.design_pattern.behavioral.template;

import xyz.ylx.design_pattern.util.XMLUtil;

public class Client {

    public static void main(String[] args) {
        Account account;
        account = (Account) XMLUtil.getBean("0");
        account.handle("张无忌", "123456");
    }
}
