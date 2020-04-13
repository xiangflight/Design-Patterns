package zen.chapter19;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/27
 */

public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        HashMap<String, String> baseInfo = new HashMap<>();
        baseInfo.put("userName", "混世魔王");
        baseInfo.put("mobileNumber", "员工电话是：");
        return baseInfo;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap<String, String> officeInfo = new HashMap<>();
        officeInfo.put("jobPosition", "职位是BOSS");
        officeInfo.put("officeTelNumber", "办公电话是");
        return officeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap<String, String> homeInfo = new HashMap<>();
        homeInfo.put("homeTelNumber", "家庭电话是");
        homeInfo.put("homeAddress", "家庭地址是");
        return homeInfo;
    }
}
