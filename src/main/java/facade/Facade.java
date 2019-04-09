package facade;

/**
 * 门面对象
 *
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version facade
 * @date 2019-04-09 21:56
 */

class Facade {

    private SubsystemA subsystemA = new SubsystemA();

    private SubsystemB subsystemB = new SubsystemB();

    private SubsystemC subsystemC = new SubsystemC();

    /**
     * 暴露出来的方法A
     */
    public void methodA() {
        this.subsystemA.operate();
    }

    /**
     * 暴露出来的方法B
     */
    public void methodB() {
        this.subsystemB.operate();
    }


    /**
     * 暴露出来的方法C
     */
    public void methodC() {
        this.subsystemC.operate();
    }

}
