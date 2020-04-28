package basic.chapter22.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/28
 */

public class Client {

    public static void main(String[] args) {
        AbstractHandsetBrand brand;

        brand = new HandsetBrandN();
        brand.setHandsetSoft(new HandsetGame());
        brand.run();

        brand.setHandsetSoft(new HandsetAddressList());
        brand.run();

        brand = new HandsetBrandM();
        brand.setHandsetSoft(new HandsetGame());
        brand.run();

        brand.setHandsetSoft(new HandsetAddressList());
        brand.run();
    }

}
