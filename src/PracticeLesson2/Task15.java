package PracticeLesson2;

import java.util.Scanner;

public class Task15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада:");
        float sum = sc.nextInt();
        System.out.println("Введите коическво месяцев:");
        int month = sc.nextInt();
        for (int i = 1; i <= month; i++)
        {
            sum+=sum * 0.07;
        }
        System.out.println(sum);
    }
}
