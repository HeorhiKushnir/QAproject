package PracticeLesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число двухмерного массива:");
        int number1 = sc.nextInt();
        System.out.println("Введите второе число двухмерного массива:");
        int number2 = sc.nextInt();
        String arr[][] = new String[number1][number2];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (i%2 == 0)
                {
                    if (j%2 ==0)
                    {
                        arr[i][j] = "W";
                    }
                    else
                        arr[i][j] = "B";
                }
                else
                {
                    if (j%2 !=0)
                    {
                        arr[i][j] = "W";
                    }
                    else
                        arr[i][j] = "B";
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
