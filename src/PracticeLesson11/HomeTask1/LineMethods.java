package PracticeLesson11.HomeTask1;

public class LineMethods
{
    public static void method1(String str)
    {
        System.out.println(str.substring(0, 4) + str.substring(9, 13));
    }

    public static void method2(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.replace(5, 8, "***");
        sb.replace(14, 17, "***");
        System.out.println(sb);
    }
    public static Object method3(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.replace(20, 21, "/");
        sb.replace(17, 19, "/");
        sb.replace(8, 14, "/");
        sb.delete(0, 5);
        return sb.toString().toLowerCase();
    }
    public static void method4(String str)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Letters: ");
        sb.append(method3(str).toString().toUpperCase());
        System.out.println(sb);
    }
    public static void method5(String str)
    {
        if (str.contains("abc") || str.contains("ABC"))
        {
            System.out.println("Contain");
        }
        else
            System.out.println("Don't contain");
    }
    public static void method6(String str)
    {
        if (str.startsWith("7382"))
        {
            System.out.println("Contain");
        }
        else
            System.out.println("Don't contain");
    }
    public static void method7(String str)
    {
        if (str.endsWith("6L4d"))
        {
            System.out.println("Contain");
        }
        else
            System.out.println("Don't contain");
    }
}
