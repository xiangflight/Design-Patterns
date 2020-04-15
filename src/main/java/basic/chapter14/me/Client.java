package basic.chapter14.me;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/15
 */

public class Client {

    public static void main(String[] args) {
        Secretary secretary = new Secretary();
        Employee employeeA = new Employee();
        secretary.add(employeeA);
        secretary.updateAll();
    }

}
