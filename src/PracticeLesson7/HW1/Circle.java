package PracticeLesson7.HW1;

public class Circle implements Figure
{
    private int radius;
    private int size;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle()
    {

    }

    public Circle(int radius, int size)
    {
        this.radius = radius;
        this.size = size;
    }

    @Override
    public double area(int radius)
    {
        return Math.PI * (radius * radius);
    }

    @Override
    public double perimeter(int radius)
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle = " + radius;
    }

    public int getRadius() {
        return radius;
    }

    public int getSize() {
        return size;
    }
}
