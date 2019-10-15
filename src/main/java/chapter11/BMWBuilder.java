package chapter11;

import java.util.ArrayList;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/15 7:48 下午
 */

public class BMWBuilder extends CarBuilder {

    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
