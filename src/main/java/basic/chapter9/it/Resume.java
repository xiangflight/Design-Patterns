package basic.chapter9.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/14
 */

public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display() {
        System.out.printf("%s %s %s ", name, sex, age);
        System.out.printf("工作经历：%s %s", timeArea, company);
        System.out.println();
    }

    @Override
    protected Resume clone() throws CloneNotSupportedException {
        return (Resume) super.clone();
    }
}
