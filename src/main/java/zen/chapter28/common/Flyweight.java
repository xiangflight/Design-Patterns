package zen.chapter28.common;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/9
 */

public abstract class Flyweight {

    private String intrinsic;

    protected final String extrinsic;

    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operate();


    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
