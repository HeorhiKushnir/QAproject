package PracticeLesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        ArrayFill.arrayRandom(arr);
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        String result = "Числа в массиве нет";
        for(int i = 0; i < arr.length; i++)
        {
           if (arr[i] == number)
               result = "Число есть в массиве";
        }
        System.out.println(result);
    }
}
