package PracticeLesson7.HW1;

public class Square implements Figure
{
    private int size;

    public Square()
    {

    }

    public Square(int size)
    {
        this.size = size;
    }

    @Override
    public double area(int size)
    {
        return size * size;
    }

    @Override
    public double perimeter(int size)
    {
        return size + size + size + size;
    }

    @Override
    public String toString()
    {
        return "Square = " + size;
    }

    public int getSize()
    {
        return size;
    }
}
