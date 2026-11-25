class Triangle
{
    double x;
    double y;
    double z;
    Triangle(double x,double y,double z)
    {
        if((x + y > z && x - y < z) && (x + z > y && x - z < y) && (y + z > x&& y - z < x))
        {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        else
        {
            double min = x < y ? x : y;
            min = min > z ? z : min;
            this.x = this.y = this.z = min;
        }
    }
    double Area()
    {
        double result = 0;
        double p = (x + y + z)/2.0;
        result = Math.sqrt(p * (p - x) * (p - y) * (p - z));
        return result;
    }
}

public class TriangleClass {
    public static void main(String[] argv)
    {
        Triangle t1 = new Triangle(3,4,5);
        Triangle t2 = new Triangle(1,2,23);

        double result1 = t1.Area();
        double result2 = t2.Area();
        System.out.println(result1);
        System.out.println(result2);
    }
}
