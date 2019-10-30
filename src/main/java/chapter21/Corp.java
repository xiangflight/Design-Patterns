package chapter21;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/30
 */

public abstract class Corp {

    private String name = "";

    private String position = "";

    private int salary = 0;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        String info = "";
        info += "姓名：" + this.name;
        info += "\t职位：" + this.position;
        info += "\t薪水：" + this.salary;
        return info;
    }
}
