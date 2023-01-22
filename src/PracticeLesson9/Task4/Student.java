package PracticeLesson9.Task4;

public class Student
{
    private String name;
    private String group;
    private int mark;

    public Student()
    {

    }

    public Student(String name)
    {
        this.name = name;
    }

    public Student(String name, String group, int mark)
    {
        this.name = name;
        this.group = group;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    public void print()
    {
        System.out.println();
    }

    @Override
    public String toString() {
        return "Group = " + group + ", name = " + name + ", mark= " + mark;
    }
}
