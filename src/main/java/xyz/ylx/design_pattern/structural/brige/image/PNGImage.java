package xyz.ylx.design_pattern.structural.brige.image;

import xyz.ylx.design_pattern.structural.brige.Matrix;
import xyz.ylx.design_pattern.structural.brige.image.Image;

// PNG格式图像，扩充实现类
public class PNGImage extends Image {

    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "格式为PNG。");
    }
}
