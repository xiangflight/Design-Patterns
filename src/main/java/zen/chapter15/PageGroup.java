package zen.chapter15;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/19
 */

public class PageGroup extends AbstractGroup {

    @Override
    public void find() {
        System.out.println("找到美工组...");
    }

    @Override
    public void add() {
        System.out.println("增加一个页面...");
    }

    @Override
    public void delete() {
        System.out.println("删除一个页面...");
    }

    @Override
    public void change() {
        System.out.println("修改一个页面...");
    }

    @Override
    public void plan() {
        System.out.println("展示页面变更计划...");
    }
}
