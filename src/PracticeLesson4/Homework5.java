package PracticeLesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число двухмерного массива:");
        int number1 = sc.nextInt();
        System.out.println("Введите второе число двухмерного массива:");
        int number2 = sc.nextInt();
        int arr[][] = new int[number1][number2];
        int j = 0;
        ArrayFill.arrayRandom(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Чисела по главной диагонали:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println("\nЧисела по второстепенной диагонали:");
        for (int i = number1 - 1; i > -1; i--)
        {
            System.out.print(arr[i][j] + " ");
            j++;
        }
    }
}
