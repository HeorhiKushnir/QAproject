package PracticeLesson4;

import java.util.Arrays;

public class Homework3
{
    public static void main(String[] args)
    {
        int arr1[][] = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int arr2[][] = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int arr3[][] = new int[3][3];
        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j < arr2[i].length; j++)
                for (int k = 0; k < arr1[i].length; k++)
                {
                    arr3[i][j] += arr1[i][k]*arr2[k][j];
                }
        for (int i = 0; i < arr3.length; i++)
        {
            System.out.println(Arrays.toString(arr3[i]));
        }
    }
}
