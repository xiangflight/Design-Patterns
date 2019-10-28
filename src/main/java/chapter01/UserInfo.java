package chapter01;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/4 10:36 下午
 */

public class UserInfo implements IUserInfo {

    private String userId;

    private String userName;

    private String password;

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean changePassword(String password) {
        return false;
    }

    @Override
    public boolean deleteUser(IUserBO userBO) {
        return false;
    }

    @Override
    public void mapUser(IUserBO userBO) {

    }

    @Override
    public boolean addOrg(IUserBO userBO, int orgId) {
        return false;
    }

    @Override
    public boolean addRole(IUserBO userBO, int roleId) {
        return false;
    }
}
