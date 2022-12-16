package xyz.ylx.design_pattern.structural.proxy.example01;

public class ProxySearcher implements Searcher {

    private RealSearcher searcher = new RealSearcher(); // 维持一个对真实主题的引用
    private AccessValidator validator;
    private Logger logger;

    @Override
    public String doSearch(String userId, String keyword) {
        // 如果身份认证成功，则执行查询
        if (validate(userId)) {
            String result = searcher.doSearch(userId, keyword);
            log(userId);
            return result;
        } else {
            return null;
        }
    }

    private boolean validate(String userId) {
        validator = new AccessValidator();
        return validator.validate(userId);
    }

    private void log(String userId) {
        logger = new Logger();
        logger.log(userId);
    }
}
