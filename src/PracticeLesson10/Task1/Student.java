package PracticeLesson10.Task1;

public class Student
{
    private String name;
    private String group;
    private int mark;
    private Place place;
    public Student()
    {

    }

    public Student(String name)
    {
        this.name = name;
    }

    public Student(String name, String group, int mark, Place place) {
        this.name = name;
        this.group = group;
        this.mark = mark;
        this.place = place;
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

    public Place getPlace() {return place;}

    public void setPlace(Place place) {this.place = place;}

    @Override
    public String toString() {
        return "Group = " + group + ", mark= " + mark;
    }
}
