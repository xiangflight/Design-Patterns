package zen.chapter19;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/27
 */

public interface IUserInfo {

    /**
     * 获取用户姓名
     *
     * @return 用户姓名
     */
    String getUserName();

    /**
     * 获取家庭地址
     *
     * @return 家庭地址
     */
    String getHomeAddress();

    /**
     * 获取手机号码
     *
     * @return 手机号码
     */
    String getMobileNumber();

    /**
     * 获取办公电话
     *
     * @return 办公电话
     */
    String getOfficeTelNumber();

    /**
     * 获取职位
     *
     * @return 职位
     */
    String getJobPosition();

    /**
     * 获取家庭电话
     *
     * @return 家庭电话
     */
    String getHomeTelNumber();

}
