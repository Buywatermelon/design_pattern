package xyz.ylx.design_pattern.structural.brige.imp;

import xyz.ylx.design_pattern.structural.brige.Matrix;

// 抽象操作系统实现类：实现类接口
public interface ImageImp {

    // 显示像素矩阵m
    void doPaint(Matrix m);
}
