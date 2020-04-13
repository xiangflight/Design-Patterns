package zen.chapter23;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/5
 */

public class ModernPostOffice {

    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police letterPolice = new Police();

    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterPolice.checkLetter(letterProcess);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }

}
