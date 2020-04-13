package zen.chapter21;

import java.util.ArrayList;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/30
 */

public class Branch extends Corp {

    ArrayList<Corp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinate(Corp corp) {
        this.subordinateList.add(corp);
    }

    public ArrayList<Corp> getSubordinate() {
        return this.subordinateList;
    }
}
