package chapter01;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/4 10:34 下午
 */

public interface IUserBiz {

    boolean changePassword(String password);

    boolean deleteUser(IUserBO userBO);

    void mapUser(IUserBO userBO);

    boolean addOrg(IUserBO userBO, int orgId);

    boolean addRole(IUserBO userBO, int roleId);

}
