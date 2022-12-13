package xyz.ylx.design_pattern.structural.brige.imp;

import xyz.ylx.design_pattern.structural.brige.Matrix;
import xyz.ylx.design_pattern.structural.brige.imp.ImageImp;

// unix操作系统实现类：具体实现类
public class UnixImp implements ImageImp {

    @Override
    public void doPaint(Matrix m) {
        System.out.println("在Unix操作系统中显示图像：");
    }
}
