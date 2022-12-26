package PracticeLesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число двухмерного массива:");
        int number1 = sc.nextInt();
        System.out.println("Введите второе число двухмерного массива:");
        int number2 = sc.nextInt();
        int arr[][] = new int[number1][number2];
        int currentSum = 0;
        int j;
        ArrayFill.arrayRandom(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < arr.length; i++)
        {
            j = i;
            currentSum += arr[i][j];
        }
        System.out.println("Сумма чисел по главной диагонали = " + currentSum);
    }
}
