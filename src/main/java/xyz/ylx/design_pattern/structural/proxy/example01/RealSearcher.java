package xyz.ylx.design_pattern.structural.proxy.example01;

public class RealSearcher implements Searcher {

    // 模拟查询商务信息
    @Override
    public String doSearch(String userId, String keyword) {
        System.out.println("用户’" + userId + "‘使用关键字’" + keyword + "‘查询商务信息！");
        return "返回具体内容";
    }
}
