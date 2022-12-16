package xyz.ylx.design_pattern.structural.proxy.example02;

public class UserDao implements AbstractUserDao {

    @Override
    public Boolean findUserById(String userId) {
        if (userId.equals("张无忌")) {
            System.out.println("查询ID为" + userId + "的用户信息成功！");
            return true;
        } else {
            System.out.println("查询ID为" + userId + "的用户信息失败！");
            return false;
        }
    }
}
