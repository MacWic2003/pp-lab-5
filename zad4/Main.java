import company.interfaces.Messenger;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;
import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        final int b = 10;
        Person[] people = new Person[5];

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Anna Kowalska", 25);
            people[2] = new Person("Piotr Nowak", 45);
            people[3] = new Person("Katarzyna Lewandowska", 35);
            people[4] = new Person("Marcin Peszko", 40);

            Messenger emailMessenger = new EmailMessenger();

            for (Person person : people) {
                int newAge = MathUtils.add(person.getAge(), b);
                emailMessenger.sendMessage("Wiek osoby " + person.getName() + " po dodaniu " + b + ": " + newAge);
            }

        } catch (InvalidAgeException e) {
            System.err.println("Błąd przy tworzeniu osoby: " + e.getMessage());
        }
    }
}