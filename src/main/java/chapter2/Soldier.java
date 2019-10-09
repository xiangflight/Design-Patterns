package chapter2;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/5 10:22 下午
 */

public class Soldier {

    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy() {
        System.out.println("士兵开始杀敌人...");
        gun.shoot();
    }

}
