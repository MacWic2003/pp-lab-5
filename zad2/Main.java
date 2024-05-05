import company.interfaces.Messenger;
import company.implementations.EmailMessenger;

public class Main {
    public static void main(String[] args) {
        Messenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Messenger");
    }
}