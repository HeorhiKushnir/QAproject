package PracticeLesson6Computer;

public class CreateComputer
{
    public static void main(String[] args)
    {
        Computer computer1 = new Computer(1000, "Asus");
        System.out.println(computer1);

        RAM ram2 = new RAM("Samsung", 8);
        HDD hdd2 = new HDD("Seagate", 500, "внутренний");
        Computer computer2 = new Computer(2000,"Lenovo", ram2, hdd2);
        System.out.println(computer2);
    }
}
