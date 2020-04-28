package basic.chapter22.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/28
 */

public abstract class AbstractHandsetBrand {

    protected AbstractHandsetSoft handsetSoft;

    public void setHandsetSoft(AbstractHandsetSoft handsetSoft) {
        this.handsetSoft = handsetSoft;
    }

    protected abstract void run();
}
