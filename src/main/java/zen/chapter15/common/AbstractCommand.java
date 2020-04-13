package zen.chapter15.common;

import zen.chapter15.CodeGroup;
import zen.chapter15.PageGroup;
import zen.chapter15.RequirementGroup;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/19
 */

public abstract class AbstractCommand {

    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();

}
