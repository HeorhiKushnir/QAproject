package PracticeLesson6;

import java.util.Scanner;

public class CreditCardHW1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CreditCard card1 = new CreditCard(1, 1000);
        CreditCard card2 = new CreditCard(2, 2000);
        CreditCard card3 = new CreditCard(3, 3000);
        System.out.println("Какую сумму положить на карточку "+ card1.cardNum + "?");
        float number1 = sc.nextInt();
        card1.curCardSum = card1.deposit(card1.curCardSum, number1);
        System.out.println("Какую сумму положить на карточку "+ card2.cardNum + "?");
        float number2 = sc.nextInt();
        card2.curCardSum = card1.deposit(card2.curCardSum, number2);
        System.out.println("Какую сумму снять с карточки "+ card3.cardNum + "?");
        float number3 = sc.nextInt();
        card3.curCardSum = card1.withdraw(card3.curCardSum, number3);
        System.out.println(card1 + "\n" +card2 + "\n" +card3);
    }
}
