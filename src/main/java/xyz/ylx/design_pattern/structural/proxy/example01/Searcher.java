package xyz.ylx.design_pattern.structural.proxy.example01;

// 抽象查询类：抽象主题类
public interface Searcher {

    public String doSearch(String userId, String keyword);
}
