package PracticeLesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива:");
        int number = sc.nextInt();
        int[] arr = new int[number];
        ArrayFill.arrayRandom(arr);
        System.out.println(Arrays.toString(arr));
        int currentMax = arr[0];
        int currentMin = arr[0];
        float currentAvg = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if (currentMax < arr[i])
            {
                currentMax = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++)
        {
            if (currentMin > arr[i])
            {
                currentMin = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            currentAvg += arr[i];
        }
        System.out.println("Самое большое ччисло =" + currentMax);
        System.out.println("Самое маленькое ччисло =" + currentMin);
        System.out.println("Среднее значение чисел =" + currentAvg/arr.length);
    }
}
