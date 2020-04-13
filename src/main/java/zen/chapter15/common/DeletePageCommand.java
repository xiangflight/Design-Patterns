package zen.chapter15.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/19
 */

public class DeletePageCommand extends AbstractCommand {

    @Override
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }
}
