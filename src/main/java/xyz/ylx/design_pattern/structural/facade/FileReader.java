package xyz.ylx.design_pattern.structural.facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 文件读取类：子系统类
public class FileReader {

    public String read(String fileNameSrc) {
        System.out.println("读取文件，获取明文：");
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream inFS = new FileInputStream(fileNameSrc);
            int data;
            while ((data = inFS.read()) != -1) {
                sb.append(data);
            }
            inFS.close();
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("文件操作错误！");
        }
        return sb.toString();
    }
}
