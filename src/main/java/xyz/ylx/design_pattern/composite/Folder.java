package xyz.ylx.design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {

    private List<AbstractFile> fileList = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        // 模拟杀毒
        System.out.println("----对文件夹'" + name + "'进行杀毒");
        // 递归调用成员构件的killVirus()方法
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
