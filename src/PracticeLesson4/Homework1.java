package PracticeLesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("На какое число увеличить массив?");
        int number = sc.nextInt();
        int arr[][][] = {{{1, 1, 1},{1, 1, 1},{1, 1, 1}},{{2, 2, 2},{2, 2, 2},{2, 2, 2}},{{3, 3, 3},{3, 3, 3},{3, 3, 3}}};
        for (int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.println(Arrays.toString(arr[i][j]));
            }
        }
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
               for (int k = 0; k < arr[i][j].length; k++)
               {
                   arr[i][j][k] += number;
               }
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.println(Arrays.toString(arr[i][j]));
            }
        }
    }
}
