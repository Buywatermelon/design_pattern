package xyz.ylx.design_pattern.structural.proxy.example01;

import xyz.ylx.design_pattern.util.XMLUtil;

public class Client {

    public static void main(String[] args) {
        Searcher searcher;
        searcher = (Searcher) XMLUtil.getBean("");
        searcher.doSearch("杨过", "玉女心经");
    }
}
