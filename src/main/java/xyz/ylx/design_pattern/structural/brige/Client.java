package xyz.ylx.design_pattern.structural.brige;

import xyz.ylx.design_pattern.structural.brige.image.Image;
import xyz.ylx.design_pattern.structural.brige.imp.ImageImp;
import xyz.ylx.design_pattern.util.XMLUtil;

public class Client {

    public static void main(String[] args) {
        Image image;
        ImageImp imp;
        image = (Image) XMLUtil.getBean("image");
        imp = (ImageImp) XMLUtil.getBean("os");

        image.setImp(imp);
        image.parseFile("小龙女");
    }
}
