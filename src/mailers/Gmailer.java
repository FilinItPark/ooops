package mailers;

/**
 * @author 1ommy
 * @version 17.10.2023
 */
public class Gmailer implements Mailer{
    @Override
    public void sendMessage(String subject, String message) {
        System.out.println("пукпукпук отправляю сообщение по гуглу человеку " + subject + " такое то: " + message);
    }

    @Override
    public void setUpData() {

    }

    @Override
    public String[] readAllMessages() {
        return new String[0];
    }
}
