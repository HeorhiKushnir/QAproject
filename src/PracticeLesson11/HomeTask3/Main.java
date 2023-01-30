package PracticeLesson11.HomeTask3;

import java.util.HashSet;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        String str = "fffff 1g f1 2tu7 fjfnr8 38324n 12122 274n";
        String[] ar = str.split(" ");
        List<String> stringList = List.of(ar);
        int size = stringList.get(0).length();
        String result = stringList.get(0);
        for (int i = 0; i< stringList.size(); i++)
        {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < stringList.get(i).length();j++)
            {
                set.add(stringList.get(i).charAt(j));
            }
            if (set.size() < size)
            {
                size = set.size();
                result = stringList.get(i);

            }
        }
        System.out.println(result);
    }
}
