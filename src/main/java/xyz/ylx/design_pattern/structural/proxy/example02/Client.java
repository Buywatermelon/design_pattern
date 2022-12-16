package xyz.ylx.design_pattern.structural.proxy.example02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        InvocationHandler handler = null;

        UserDao userDao = new UserDao();
        handler = new DaoLogHandler(userDao);
        AbstractUserDao userProxy = null;
        // 创建动态代理对象，用于代理一个AbstractUserDao类型的真实主题对象
        userProxy = (AbstractUserDao) Proxy.newProxyInstance(AbstractUserDao.class.getClassLoader(), new Class[]{AbstractUserDao.class}, handler);
        // 调用代理对象的业务方法
        userProxy.findUserById("张无忌");

        DocumentDao documentDao = new DocumentDao();
        handler = new DaoLogHandler(documentDao);
        AbstractDocumentDao documentProxy = null;
        // 创建动态代理对象，用于代理一个AbstractDocumentDao类型的真实主题对象
        documentProxy = (AbstractDocumentDao) Proxy.newProxyInstance(AbstractDocumentDao.class.getClassLoader(), new Class[]{AbstractDocumentDao.class}, handler);
        // 调用代理对象的业务方法
        documentProxy.deleteDocumentById("DO01");
    }
}
