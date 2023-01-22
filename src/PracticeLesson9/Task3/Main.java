package PracticeLesson9.Task3;

import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя студента для информации:");
        String str = sc.nextLine();
        int count = 0;
        Student student1 = new Student("Max", "Group 1", 5);
        Student student2 = new Student("Alex", "Group 2", 7);
        Student student3 = new Student("Bob", "Group 3", 9);
        Student student4 = new Student("Jack", "Group 1", 4);
        Student student5 = new Student("Harry", "Group 2", 10);
        Student student6 = new Student("Niko", "Group 3", 6);
        Student student7 = new Student("Tom", "Group 1", 2);
        Student student8 = new Student("Sam", "Group 2", 9);
        Student student9 = new Student("Kate", "Group 3", 10);
        List<Student> list = List.of(student1,student2,student3, student4, student5, student6, student7,student8,student9);
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getName().equals (str))
            {
                System.out.println(list.get(i));
                count++;
            }
            else if (i == list.size() - 1 && count == 0)
            {
                System.out.println("Неверно введено имя студента!");
            }
        }
    }
}
