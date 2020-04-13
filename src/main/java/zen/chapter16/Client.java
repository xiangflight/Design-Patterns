package zen.chapter16;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/21
 */

public class Client {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
        AbstractHandler father = new Father();
        AbstractHandler husband = new Husband();
        AbstractHandler son = new Son();
        father.setNextHandler(husband);
        husband.setNextHandler(son);
        arrayList.forEach(father::handleMessage);
    }

}
