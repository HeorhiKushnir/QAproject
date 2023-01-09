package PracticeLesson7.HW1;

public class Triangle implements Figure
{
    private int size;
    @Override
    public double area(int a)
    {
        return (((a * a) * Math.sqrt(3)) / 4);
    }

    @Override
    public double perimeter(int size)
    {
        return size * 3;
    }

    @Override
    public String toString()
    {
        return "Triangle = " + size;
    }

    public Triangle(int size)
    {
        this.size = size;
    }

    public Triangle()
    {

    }

    public int getSize() {
        return size;
    }
}
