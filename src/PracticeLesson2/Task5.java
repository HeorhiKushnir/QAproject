package PracticeLesson2;

import java.util.Scanner;

public class Task5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        if (number % 2 == 0)
            System.out.println("Число чётное");
        else
            System.out.println("Число нечётное");
    }
}
