package zen.chapter13;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/17 11:09 下午
 */

public class PrototypeClass implements Cloneable {

    @Override
    protected PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
