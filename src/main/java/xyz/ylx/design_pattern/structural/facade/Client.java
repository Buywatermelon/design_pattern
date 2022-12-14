package xyz.ylx.design_pattern.structural.facade;

import xyz.ylx.design_pattern.util.XMLUtil;

public class Client {

    public static void main(String[] args) {
        AbstractEncryptFacade ef = (AbstractEncryptFacade) XMLUtil.getBean("");
        assert ef != null;
        ef.fileEncrypt("facade/src.txt", "facade/des.txt");
    }
}
