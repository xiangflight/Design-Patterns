package zen.chapter20;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/28
 */

public interface IProject {

    void add(String name, int num, int cost);

    /**
     * 获取项目信息
     *
     * @return 项目信息
     */
    String getProjectInfo();

    IProjectIterator iterator();

}
