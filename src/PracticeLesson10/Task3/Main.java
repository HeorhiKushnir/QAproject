package PracticeLesson10.Task3;

import java.util.Scanner;
import java.util.Stack;


public class Main
{
    public static void main(String[] args)
    {
        Queue stack = new Queue();
        System.out.println(stack);

        for (int i = 0; i < 10; i++)
        {
            System.out.println("Добавить число в очередь");
            int sc = new Scanner(System.in).nextInt();
            stack.enqueue(sc);
        }
        System.out.println(stack);

        for (int i = 0; i < 5; i++)
        {
            stack.dequeue();
        }
    }
}
