package experiment3;

class Circle implements Shape
{
    private double radius;

    Circle()
    {
        this(0);
    }
    Circle(double r)
    {
        this.radius = r;
    }
    double getRadius()
    {
        return this.radius;
    }
    double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }
    double getArea()
    {
        return Math.PI * radius * radius;
    }
    void disp()
    {
        double Radius = getRadius();
        double Perimeter = getPerimeter();
        double Area = getArea();

        System.out.println("the data of circle:");
        System.out.println("radius: " + Radius);
        System.out.println("Perimeter: " + Perimeter);
        System.out.println("Area: " + Area);
    }

    @Override
    public double area()
    {
        return getArea();
    }
}


public class CircleClass {
    public static void main(String[] argv)
    {
        Circle c = new Circle(6.5);
        c.disp();
    }
}
