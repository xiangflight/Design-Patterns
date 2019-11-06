package chapter24;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/6
 */

public class Client {

    public static void main(String[] args) {
        Boy boy = new Boy();
        Caretaker caretaker = new Caretaker();
        boy.setState("心情很棒！");
        System.out.println("=== 男孩现在的心态 ===");
        System.out.println(boy.getState());
        caretaker.setMemento(boy.createMemento());
        boy.changeState();
        System.out.println("=== 男孩追女孩的心态 ===");
        System.out.println(boy.getState());
        boy.restoreMemonto(caretaker.getMemento());
        System.out.println("=== 男孩恢复后的状态 ===");
        System.out.println(boy.getState());
    }

}
