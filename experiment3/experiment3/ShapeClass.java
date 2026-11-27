package experiment3;

interface Shape
{
    double area();         
}

class Triangle implements Shape
{
    private double a,b,c;
    Triangle(double a,double b,double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area()
    {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

class Rectangle implements Shape
{
    private double a,b;
    Rectangle(double a,double b)
    {
        this.a = a;
        this.b = b;
    }
    @Override
    public double area()
    {
        return a * b;
    }
}

// 说明：Circle 类统一定义在 CircleClass.java 中（并已实现 Shape 接口的 area()）。
// 同一个包里不允许出现两个同名的 Circle，所以这里不再重复定义。

public class ShapeClass {
    public static void main(String[] args)
    {
        Shape[] shapes = { new Triangle(3, 4, 5), new Rectangle(2, 3), new Circle(2) };
        for (Shape s : shapes)
        {
            System.out.println(s.getClass().getSimpleName() + " area = " + s.area());
        }
    }
}
