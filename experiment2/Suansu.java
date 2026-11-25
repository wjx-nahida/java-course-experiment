public class Suansu {
    int a;
    int b;
    Suansu(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    void AddAB()
    {
        int result = a + b;
        System.out.println("AddAB: " + result);
    }
    void MultiAB()
    {
        int result = a * b;
        System.out.println("MultiAB: " + result);
    }
    void DivAB()
    {
        double result = (double)a / b;
        System.out.println("DivAB: " + result);
    }
}
