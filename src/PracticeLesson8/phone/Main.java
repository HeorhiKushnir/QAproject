package PracticeLesson8.phone;

import java.security.PublicKey;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Phone phone1 = new Phone(37529, "Apple", 200);
        Phone phone2 = new Phone(37544, "Samsung", 300);
        Phone phone3 = new Phone(37525, "Nokia", 400);
        System.out.println(phone1 + "\n" + phone2 + "\n" + phone3);

        phone1.receiveCall("Gena");
        phone2.receiveCall("Olga");
        phone3.receiveCall("Sasha");

        int number1 = phone1.getNumber();
        int number2 = phone2.getNumber();
        int number3 = phone3.getNumber();
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        phone1.receiveCall("Alex", 37533);

        int[] num = phone1.sendMessage(phone1.getNumber(),phone2.getNumber(),phone3.getNumber());
        System.out.println(Arrays.toString(num));
    }
}
