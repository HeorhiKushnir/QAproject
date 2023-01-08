package PracticeLesson7.HW1;

import java.util.Arrays;

public class HW1
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(3);
        double area1 = circle.area(circle.getRadius());
        double perimetr1 = circle.perimeter(circle.getRadius());
        System.out.println(area1 + "\n" + perimetr1);

        Triangle triangle = new Triangle(4);
        double area2 = triangle.area(triangle.getSize());
        double perimetr2 = triangle.perimeter(triangle.getSize());
        System.out.println(area2 + "\n" + perimetr2);

        Square square = new Square(5);
        double area3 = square.area(square.getSize());
        double perimetr3 = square.perimeter(square.getSize());
        System.out.println(area3 + "\n" + perimetr3);

        Figure[] figures = new Figure[] {circle, triangle, square, circle, triangle};
        System.out.println(Arrays.toString(figures));
        int sum = 0;
        for (int i = 0; i < figures.length; i++)
        {
            if (figures[i] == circle)
            {
                sum += circle.perimeter(circle.getRadius());
            }
            else if (figures[i] == triangle)
            {
                sum += triangle.perimeter(triangle.getSize());
            }
            else
                sum += square.perimeter(square.getSize());
        }
        System.out.println(sum);
    }
}
