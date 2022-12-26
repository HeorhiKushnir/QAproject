package PracticeLesson2;

import java.util.Scanner;

public class Task6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру:");
        int t = sc.nextInt();

        if (t>-5)
            System.out.println("Тепло");
        else if (-5>=t && t>-20)
        {
            System.out.println("Нормально");
        }
        else
            System.out.println("Холодно");
    }
}
