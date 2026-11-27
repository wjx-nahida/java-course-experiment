package experiment3;

class Cylinder extends Circle
{
    private double height;
    Cylinder(double r,double h)
    {
        super(r);
        this.height = h;
    }
    double getHeight()
    {
        return this.height;
    }
    double getCylinderArea()
    {
        return 2 * getArea() + getPerimeter() * height;
    }
    double getVol()
    {
        return getArea() * height;
    }
    void dispVol()
    {
        double Vol = getVol();
        System.out.println("the data of clinder:");
        System.out.println("Vol: " + Vol);
    }
}

public class CylinderClass {
    public static void main(String[] argv)
    {
        Cylinder c = new Cylinder(6.5,5.5);
        c.disp();
        c.dispVol();
    }
}
