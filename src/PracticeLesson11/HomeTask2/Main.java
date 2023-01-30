package PracticeLesson11.HomeTask2;

import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввести n строк");
        String str = sc.nextLine();
        String[] ar = str.split(" ");
        List<String> stringList = List.of(ar);
        int range = stringList.get(0).length();
        String result1 = stringList.get(0);
        String result2 = stringList.get(0);
        for (int i = 1; i < stringList.size(); i++)
        {
            if (range >= stringList.get(i).length())
            {
                range = stringList.get(i).length();
                result1 =stringList.get(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cамая короткая строка и её длинна: ");
        sb.append(result1);
        sb.append("  ");
        sb.append(range);
        System.out.println(sb);

        for (int i = 1; i < stringList.size(); i++)
        {
            if (range <= stringList.get(i).length())
            {
                range = stringList.get(i).length();
                result2 =stringList.get(i);
            }
        }
        System.out.println("Cамая длинная строка и её длинна: " + result2 + " " + range);
    }
}
