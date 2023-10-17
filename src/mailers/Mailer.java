package mailers;

/**
 * @author 1ommy
 * @version 17.10.2023
 */
public interface Mailer {
    void sendMessage(String subject, String message);
    void setUpData();
    String[] readAllMessages();
}
