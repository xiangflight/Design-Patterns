package basic.chapter16.it;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/16
 */

public class Client {

    public static void main(String[] args) {
        Work emergencyProject = new Work();
        emergencyProject.setHour(9);
        emergencyProject.writeProgram();
        emergencyProject.setHour(10);
        emergencyProject.writeProgram();
        emergencyProject.setHour(12);
        emergencyProject.writeProgram();
        emergencyProject.setHour(13);
        emergencyProject.writeProgram();
        emergencyProject.setHour(14);
        emergencyProject.writeProgram();
        emergencyProject.setHour(17);
        emergencyProject.writeProgram();
        emergencyProject.setTaskFinished(false);
        emergencyProject.writeProgram();
        emergencyProject.setHour(19);
        emergencyProject.writeProgram();
        emergencyProject.setHour(22);
        emergencyProject.writeProgram();
    }
}
