package chapter11;

import java.util.ArrayList;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/15 7:44 下午
 */

public class Client {

    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);

        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
        benzModel.run();

        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);

        BMWModel bmwModel = (BMWModel) bmwBuilder.getCarModel();
        bmwModel.run();
    }

}
