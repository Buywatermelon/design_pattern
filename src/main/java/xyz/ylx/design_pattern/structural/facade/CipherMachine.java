package xyz.ylx.design_pattern.structural.facade;

import org.w3c.dom.ls.LSOutput;

// 数据加密类：子系统类
public class CipherMachine {

    public String encrypt(String plainText) {
        System.out.println("数据加密，将明文转换为密文");
        StringBuilder es = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            String c = String.valueOf(plainText.charAt(i) % 7);
            es.append(c);
        }
        System.out.println(es);
        return es.toString();
    }
}
