package xyz.ylx.design_pattern.structural.brige.image;

import xyz.ylx.design_pattern.structural.brige.Matrix;

public class GIFImage extends Image {

    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "格式为GIF。");
    }
}
