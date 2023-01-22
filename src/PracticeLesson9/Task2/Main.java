package PracticeLesson9.Task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Введите имя:");
            String str = sc.nextLine();
            ar.add(str);
        }
        System.out.println(ar);
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(ar);
        System.out.println(hashSet);
        int size1 = ar.size() - hashSet.size();
        System.out.println("Количество повторяющихся имён: " + size1);
    }
}
