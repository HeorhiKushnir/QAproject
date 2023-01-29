package PracticeLesson10.Task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 2, 4, 100, 4, 100, 2};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int j : arr) {
            if (set1.contains(j))
            {
                set2.add(j);
            }
            else
                set1.add(j);
        }

        set1.removeAll(set2);
        System.out.println("Unique number is - " + set1);
    }
}
