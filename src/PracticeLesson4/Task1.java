package PracticeLesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число двухмерного массива:");
        int number1 = sc.nextInt();
        System.out.println("Введите второе число двухмерного массива:");
        int number2 = sc.nextInt();
        int arr[][] = new int[number1][number2];
        int currentMax = arr[0][0];
        ArrayFill.arrayRandom(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 1; j < arr[i].length; j++)
            {
                if (currentMax < arr[i][j])
                {
                    currentMax = arr[i][j];
                }
            }
        }
        System.out.println("Самое большое число =" + currentMax);
    }
}
