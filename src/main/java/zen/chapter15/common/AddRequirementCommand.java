package zen.chapter15.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/19
 */

public class AddRequirementCommand extends AbstractCommand {


    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
