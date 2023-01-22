package PracticeLesson9.Task4;


import java.util.*;

public class Main2
{
    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (Map.Entry<K, V> i: map.entrySet())
        {
            if (value.equals(i.getValue())) {
                return i.getKey();
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        float count1 = 0;
        float count2 = 0;
        float count3 = 0;
        int markG1 = 0;
        int markG2 = 0;
        int markG3 = 0;
        Student student1 = new Student("Max", "Group 1", 9);
        Student student2 = new Student("Alex", "Group 2", 6);
        Student student3 = new Student("Bob", "Group 3", 3);
        Student student4 = new Student("Jack", "Group 1", 8);
        Student student5 = new Student("Harry", "Group 2", 9);
        Student student6 = new Student("Niko", "Group 3", 5);
        Student student7 = new Student("Tom", "Group 1", 7);
        Student student8 = new Student("Sam", "Group 2", 8);
        Student student9 = new Student("Kate", "Group 3", 6);
        List<Student> list = List.of(student1,student2,student3, student4, student5, student6, student7,student8,student9);
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getGroup().equals ("Group 1"))
            {
                markG1 += list.get(i).getMark();
                count1++;
            }
            else if (list.get(i).getGroup().equals ("Group 2"))
            {
                markG2 += list.get(i).getMark();
                count2++;
            }
            else
            {
                markG3 += list.get(i).getMark();
                count3++;
            }
        }
        Map<String, Float> map = new HashMap<>();
        map.put("Group 1", markG1 / count1);
        map.put("Group 2", markG2 / count2);
        map.put("Group 3", markG3 / count3);
        float minAvg = Collections.min(map.values());
        String weakG = getKey(map, minAvg);
        System.out.println(weakG);
        System.out.println("Список слабой группы:");
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getGroup().equals (weakG))
            {
                System.out.println(list.get(i));
            }
        }
    }
}
