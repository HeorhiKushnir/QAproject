package PracticeLesson6Computer;

public class RAM
{
    public String name;
    public int size;

    public RAM(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public RAM()
    {
    }

    @Override
    public String toString() {
        return " name = " + name + ", size = " + size + ".";
    }
}
