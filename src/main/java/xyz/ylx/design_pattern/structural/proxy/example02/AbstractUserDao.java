package xyz.ylx.design_pattern.structural.proxy.example02;

// 抽象 UserDao：抽象主题角色
public interface AbstractUserDao {

    Boolean findUserById(String userId);
}
