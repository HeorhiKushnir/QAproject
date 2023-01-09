package PracticeLesson7.HW2;

public class HW2
{
    public static void main(String[] args)
    {
        Director director = new Director("Директор");
        Worker worker = new Worker("Рабочий");
        Accountant accountant = new Accountant("Бухгалтер");

        director.print();
        worker.print();
        accountant.print();
    }
}
