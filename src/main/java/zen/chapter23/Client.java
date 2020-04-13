package zen.chapter23;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/5
 */

public class Client {

    public static void main(String[] args) {
        ModernPostOffice office = new ModernPostOffice();
        String address = "Happy Road No. 666, God Province, Heaven";
        String context = "Hello, It's me, do you know who I am? Im your old lover. I'd like to...";
        office.sendLetter(context, address);
    }

}
