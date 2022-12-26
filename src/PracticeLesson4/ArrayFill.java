package PracticeLesson4;

import java.util.Random;

public class ArrayFill
{
    public static void arrayRandom(int[] arr)
    {
        Random random  = new Random();
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt(100);
        }
    }

    public static void arrayRandom(int[][] arr)
    {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = random.nextInt(100);
            }
        }
    }
}
