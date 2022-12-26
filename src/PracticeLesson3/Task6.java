package PracticeLesson3;

import java.util.Arrays;

public class Task6
{
    public static void main(String[] args)
    {
        int[] arr = new int[13];
        ArrayFill.arrayRandom(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++)
        {
            if (i % 2 != 0)
                arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
