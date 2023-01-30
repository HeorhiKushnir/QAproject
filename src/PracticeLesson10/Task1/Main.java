package PracticeLesson10.Task1;

import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Hostel hostel1 = new Hostel("host1", "adr1");
        Hostel hostel2 = new Hostel("host2", "adr2");

        Place place1 = new Place(hostel1, 1);
        Place place2 = new Place(hostel1, 2);
        Place place3 = new Place(hostel2, 5);
        Place place4 = new Place(hostel2, 6);

        Student student1 = new Student("Max", "Group 1", 6,place1);
        Student student2 = new Student("Alex", "Group 2", 7,place2);
        Student student3 = new Student("Bob", "Group 3", 8,place3);
        Student student4 = new Student("Liza", "Group 4", 5,place4);
        Student student5 = new Student("Ella", "Group 1", 4,place1);
        Student student6 = new Student("Mark", "Group 2", 8,place2);
        Student student7 = new Student("Lola", "Group 3", 9,place3);
        Student student8 = new Student("Anny", "Group 4", 3,place4);

        List<Student> students = List.of(student1, student2, student3,student4,student5,student6,student7,student8);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title of hostel:");
        String str = sc.nextLine();

        for (Student student : students) {
            if (student.getPlace().getHostel().getTitle().equals(str))
            {
                System.out.println("Name - " + student.getName() + ", room - " + student.getPlace().getRoom());
            }
        }

    }
}
