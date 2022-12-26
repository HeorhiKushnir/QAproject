package PracticeLesson2;

public class Task2
{
    public static void main(String[] args)
    {
        int j = 10;
        int k = 0;
        while (j <= 55)
        {
            if (j % 2 == 0)
            {
                k += j;
            }
            j++;
        }
        System.out.println(k);
    }
}
