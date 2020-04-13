package zen.chapter17.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/23
 */

public class Decorator extends Component{

    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }

}
