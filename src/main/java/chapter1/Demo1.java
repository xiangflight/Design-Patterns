package chapter1;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/4 10:36 下午
 */

public class Demo1 {
    public static void main(String[] args) {
        IUserInfo userInfo = new UserInfo();
        IUserBO userBO = userInfo;
        userBO.setPassword("abc");
        IUserBiz userBiz = userInfo;
        userBiz.deleteUser(userBO);
    }
}
