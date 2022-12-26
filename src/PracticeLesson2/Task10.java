package PracticeLesson2;

import java.util.Scanner;

public class Task10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        int k = 0;
        int j = 1;
        while (j <= number)
        {
            k += j;
            j++;
        }
        System.out.println(k);
    }
}
