package chapter11;

import java.util.ArrayList;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/15 7:47 下午
 */

public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
