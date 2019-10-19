package chapter15;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/19
 */

public class CodeGroup extends AbstractGroup {

    @Override
    public void find() {
        System.out.println("找到代码组...");
    }

    @Override
    public void add() {
        System.out.println("增加一项功能...");
    }

    @Override
    public void delete() {
        System.out.println("删除一项功能...");
    }

    @Override
    public void change() {
        System.out.println("修改一项功能...");
    }

    @Override
    public void plan() {
        System.out.println("展示代码变更计划...");
    }
}
