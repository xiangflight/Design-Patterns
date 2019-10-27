package chapter19;

import java.util.Map;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/27
 */

public interface IOuterUser {

    /**
     * 获取用户基本信息
     *
     * @return 用户基本信息
     */
    Map getUserBaseInfo();

    /**
     * 获取用户办公信息
     *
     * @retur 用户办公信息
     */
    Map getUserOfficeInfo();

    /**
     * 获取用户家庭信息
     *
     * @return 用户家庭信息
     */
    Map getUserHomeInfo();

}
