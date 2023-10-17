import mailers.Gmailer;
import mailers.Mailer;
import test.Animal;

/**
 * @author 1ommy
 * @version 17.10.2023
 */
public class Main {
    public static void sayHello(Animal animal) {
        System.out.println(animal.sayHello());
    }

    public static void sendEmail(Mailer mailer) {
        mailer.sendMessage("Hello", "Hello");
    }


    public static void main(String[] args) {
        Animal.pukpuk();

       /* Animal animal = new Animal("Jack", "5", 2, 2);
        Animal cat = new Cat("Tom", "2", 5, 2, "Blackjack");
        Animal dog = new Dog("Alex", "2", 5, 3, "Ovcharka");

        sayHello(animal);
        sayHello(cat);
        sayHello(dog);*/

//        Mailer yandexMailer = new YandexMailer();
        Mailer gmail = new Gmailer();
//        sendEmail(yandexMailer);
        sendEmail(gmail);

        //        Animal a = new Animal("Tom", 2, "Black");
//        System.out.println(a.name);
//
//        Animal b = new Animal("Jack", 5, "White");
//        System.out.println(b.getName());
/*
        BankAccount account = new BankAccount(100);
        System.out.println(account.getBalance());

        account.setBalance(-5000000);
        System.out.println(account.getBalance());

        System.out.println(account.toString());
        *//*System.out.println(account.sum(2,3));
        System.out.println(account.sum(2,3,4));*//*

        double d = 5.23;
        int a = (int) d;

        String str1 = "Hello world";
        String str2 = "Privet mir";
        System.out.println(str1.equals(str2));

        BankAccount account1 = new BankAccount(100);
        BankAccount account2 = new BankAccount(200);
        System.out.println(account.equals(account2));*/

    }
}