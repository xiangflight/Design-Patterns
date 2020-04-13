package zen.chapter05;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/10 7:33 上午
 */

public class Client {

    public static void main(String[] args) {
//        List<Girl> listGirls = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            listGirls.add(new Girl());
//        }
//        Teacher teacher = new Teacher();
//        teacher.command(new GroupLeader(listGirls));

        InstallSoftware invoker = new InstallSoftware();
        invoker.installWizard(new Wizard());
    }

}
