package PracticeLesson2;

public class Task14
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= 11; ++i)
        {
            int next = a + b;
            a = b;
            b = next;
            System.out.println(b);
        }

    }
}
