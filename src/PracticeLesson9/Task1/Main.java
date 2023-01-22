package PracticeLesson9.Task1;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Найти пары скобок из:");
        String str = sc.nextLine();
        boolean symbol1 = false;
        int count1 = 0;
        boolean symbol2 = false;
        int count2 = 0;
        boolean symbol3 = false;
        int count3 = 0;
        boolean symbol4 = false;
        int count4 = 0;
        ArrayList<Character> newChr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++)
        {
            newChr.add(str.charAt(i));
        }
        System.out.println(newChr);
        for (int i = 0; i < newChr.size(); i++)
        {
            if (newChr.get(i) == 40)
            {
                symbol1 = true;
            }
            else if (newChr.get(i) == 41 && symbol1 == true)
            {
                count1++;
                symbol1 = false;
            }
            if (newChr.get(i) == 91)
            {
                symbol2 = true;
            }
            else if (newChr.get(i) == 93 && symbol2 == true)
            {
                count2++;
                symbol2 = false;
            }
            if (newChr.get(i) == 123)
            {
                symbol3 = true;
            }
            else if (newChr.get(i) == 125 && symbol3 == true)
            {
                count3++;
                symbol3 = false;
            }
            if (newChr.get(i) == 60)
            {
                symbol4 = true;
            }
            else if (newChr.get(i) == 62 && symbol4 == true)
            {
                count4++;
                symbol4 = false;
            }
        }
        int sum = count1 + count2 + count3 + count4;
        System.out.println("Пар ( ) в строке:" + count1);
        System.out.println("Пар [ ] в строке:" + count2);
        System.out.println("Пар { } в строке:" + count3);
        System.out.println("Пар < > в строке:" + count4);
        System.out.println("Всего пар: " + sum);
    }
}
