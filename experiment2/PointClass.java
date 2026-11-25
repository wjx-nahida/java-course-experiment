
class MyPoint
{
    private int x;
    private int y;
    MyPoint()
    {
        x = 0;
        y = 0;
    }
    MyPoint(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    float getD(MyPoint mp)
    {
        float result = 0;
        int dist_x = mp.x - this.x;
        int dist_y = mp.y - this.y;
        result = (float)Math.sqrt(dist_x * dist_x + dist_y * dist_y);
        return result;
    }
};

public class PointClass {
    public static void main(String[] argv)
    {
        MyPoint mp1 = new MyPoint(2,3);
        MyPoint mp2 = new MyPoint(4,5);
        float dist = mp1.getD(mp2);
        System.out.println(dist);
    }
}
