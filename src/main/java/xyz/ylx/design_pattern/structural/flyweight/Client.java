package xyz.ylx.design_pattern.structural.flyweight;

public class Client {

    public static void main(String[] args) {
        IgoChessman black1, black2, black3, white1, white2;
        IgoChessmanFactory factory;

        // 获取享元工厂对象
        factory = IgoChessmanFactory.getInstance();

        // 通过享元工厂获取3颗黑子
        black1 = IgoChessmanFactory.getIgoChessman("b");
        black2 = IgoChessmanFactory.getIgoChessman("b");
        black3 = IgoChessmanFactory.getIgoChessman("b");
        System.out.println("两颗黑子是否相同：" + (black1 == black2));

        // 通过享元工厂获取2颗白子
        white1 = IgoChessmanFactory.getIgoChessman("w");
        white2 = IgoChessmanFactory.getIgoChessman("w");
        System.out.println("两颗白子是否相同：" + (white1 == white2));

        black1.display(new Coordinates(1,1));
        black2.display(new Coordinates(2,2));
        black3.display(new Coordinates(3,3));
        white1.display(new Coordinates(4,4));
        white2.display(new Coordinates(5,5));
    }
}
