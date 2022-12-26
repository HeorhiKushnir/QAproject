package PracticeLesson3;

import java.util.Arrays;

public class Task4
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        int[] arr1 = new int[5];
        float currentAvg1 = 0;
        float currentAvg2 = 0;
        ArrayFill.arrayRandom(arr);
        ArrayFill.arrayRandom(arr1);
        for (int i = 0; i < arr.length; i++)
        {
            currentAvg1 += arr[i];
        }
        currentAvg1 /= arr.length;
        System.out.println("Первый массив = " + Arrays.toString(arr) + " Среднее значение = " + currentAvg1);
        for (int i = 0; i < arr1.length; i++)
        {
            currentAvg2 += arr1[i];
        }
        currentAvg2 /= arr1.length;
        System.out.println("Второй массив = " + Arrays.toString(arr1) + " Среднее значение = " + currentAvg2);
        if (currentAvg1 < currentAvg2)
            System.out.println("Среднее у первого массива меньше чем у второго.");
        else if (currentAvg2 < currentAvg1)
        {
            System.out.println("Среднее у второго массива меньше чем у первого.");
        }
        else
            System.out.println("Средние у массивов равны.");
    }
}
