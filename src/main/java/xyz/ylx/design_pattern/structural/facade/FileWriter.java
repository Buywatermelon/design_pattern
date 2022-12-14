package xyz.ylx.design_pattern.structural.facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 文件保存类，子系统类
public class FileWriter {

    public void write(String encryptStr, String fileName) {
        System.out.println("保存密文，写入文件");
        try {
            FileOutputStream outFS = new FileOutputStream(fileName);
            outFS.write(encryptStr.getBytes());
            outFS.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("文件操作错误！");
        }
    }
}