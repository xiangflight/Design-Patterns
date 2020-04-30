package basic.chapter28.it;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/30
 */

public class ObjectStructure {

    List<AbstractElement> elements = new ArrayList<>();

    public void attach(AbstractElement element) {
        elements.add(element);
    }

    public void detach(AbstractElement element) {
        elements.remove(element);
    }

    public void accept(AbstractVisitor visitor) {
        elements.forEach(element -> {
            element.accept(visitor);
        });
    }

}
