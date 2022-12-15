package xyz.ylx.design_pattern.structural.flyweight;

import java.util.HashMap;

// 围棋棋子工厂类：享元工厂类，使用单例模式进行设计
public class IgoChessmanFactory {

    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static HashMap<String, IgoChessman> hm; // 使用HashMap来存储享元对象，充当享元池

    private IgoChessmanFactory() {
        hm = new HashMap<>();
        IgoChessman black, white;
        black = new BlackIgoChessman();
        white = new WhiteIgoChessman();
        hm.put("b", black);
        hm.put("w", white);
    }

    // 返回享元工厂的唯一实例
    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    // 通过key来获取存储在HashMap中的享元对象
    public static IgoChessman getIgoChessman(String color) {
        return hm.get(color);
    }
}
