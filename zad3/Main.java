import company.interfaces.Messenger;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int sum = MathUtils.add(10, 20);
        System.out.println("Suma: " + sum);
        Messenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Suma dwóch liczb wynosi: " + sum);
    }
}