package PracticeLesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        int[] arr1 = new int[10];
        int j = 0;
        String result = "Числа в массиве нет";
        ArrayFill.arrayRandom(arr);
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] != number)
            {
                arr1[j] = arr[i];
                j++;
            }
            else
            {
                result = "Число есть в массиве";
            }
        }
        System.out.println(result);
        System.out.println(Arrays.toString(arr1));
    }
}