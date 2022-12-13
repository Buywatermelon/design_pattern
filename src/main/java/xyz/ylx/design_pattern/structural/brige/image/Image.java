package xyz.ylx.design_pattern.structural.brige.image;

import xyz.ylx.design_pattern.structural.brige.imp.ImageImp;

// 抽象图像类：抽象类
public abstract class Image {

    protected ImageImp imp;

    public void setImp(ImageImp img) {
        this.imp = img;
    }

    public abstract void parseFile(String fileName);
}
