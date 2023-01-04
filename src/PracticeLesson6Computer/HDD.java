package PracticeLesson6Computer;

public class HDD
{
    public String name;
    public int size;
    public String type;

    public HDD(String name, int size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public HDD() {
    }

    @Override
    public String toString() {
        return " name = " + name + ", size = " + size + ", type = " + type + ".";
    }
}
