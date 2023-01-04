package PracticeLesson6Computer;

public class Computer
{
    public int cost;
    public String model;
    public RAM ram;
    public HDD hdd;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    public Computer(int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer: cost = " + cost + ", model = " + model + ", ram =" + ram + ", hdd =" + hdd + ".";
    }
}
