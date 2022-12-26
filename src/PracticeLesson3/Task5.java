package PracticeLesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = 0;
        int j = 0;
        int k = 0;
        for (int i = 1; i > 0; i++)
        {
            System.out.println("Введите длинну массива:");
            int number = sc.nextInt();
            if (number <= 5)
            {
                System.out.println("Число маленькое,попроуйте больше.");
            }
            else if (number > 10)
            {
                System.out.println("Число большое,попроуйте меньше.");
            }
            else
            {
                number1 = number;
                break;
            }
        }
        int[] arr = new int[number1];
        ArrayFill.arrayRandom(arr);
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                j++;
            }
        }
        int[] arr1 = new int[j];
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                arr1[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
