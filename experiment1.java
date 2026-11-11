import java.util.Random;

public class experiment1 {
    public static void main(String[] argv)
    {
        PrintPrime();

        System.out.println(CalculateByIf(3.3));
        System.out.println(CalculateBySwitch(6.5));

        PrintNarcissisticNumber();

        System.out.println(RandomNumberTotal());

        PerfectNumber();

        System.out.println(CalculateE());
    }
    // 1.编写一个程序，打印100~200之间的素数
    // 要求每行按10个数（数与数之间有一个空格隔离）的形式对其输出
    public static boolean IsPrime(int n)
    {
        int i = n - 1;
        while(i > 1)
        {
            if(n % i == 0)
                return false;
            i -= 1;
        }
        return true;
    }
    
    public static void PrintPrime()
    {
        int count = 0;
        for(int i = 100;i < 201;i++)
        {
            if(IsPrime(i))
            {
                System.out.print(i);
                count++;
                if(count == 10)
                {
                    count = 0;
                    System.out.println();
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }

    // 2.编写一个程序，给定一个t的值（可初始化定义）
    // 按下式计算y值并输出，要求分别写出if和switch语句。
    public static double CalculateByIf(double t)
    {
        double result = 0.0;
        if(0 <= t && t < 1 )
        {
            result = t * t - 1;
        }
        else if(1 <= t && t < 3)
        {
            result = t * t * t  - 2 * t - 2;
        }
        else if(3 <= t && t < 5)
        {
            result = t * t - t * Math.sin(t);
        }
        else if(5 <= t && t < 7)
        {
            result = t + 1;
        }
        else
        {
            result = t - 1;
        }
        return result;
    }
    public static double CalculateBySwitch(double t)
    {
        double result = 0.0;
        int key = (int)Math.floor(t);
        switch(key)
        {
            case 0 ->
                result = t * t - 1;
            case 1,2 ->
                result = t * t * t - 2 * t - 2;
            case 3,4 ->
                result = t * t - t * Math.sin(t);
            case 5,6 ->
                result = t + 1;
            default ->
                result = t - 1;   
        }
        return result;
    }

    // 3.打印出所有的“水仙花数”。
    // “水仙花数”是指一个三位数，其各位数字的立方和等于该数本身
    public static void PrintNarcissisticNumber()
    {
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        for(int i = 100;i < 1000;i++)
        {
            number1 = i / 100;
            number3 = i % 10;
            number2 = (i / 10) % 10;
            if(number1 * number1 * number1 + number2 * number2 * number2 + number3 * number3 * number3 == i)
                System.out.println(i);
        }
    }
    // 4.编写一个Java应用程序，先产生1个随机数n（0<n<10）
    // 然后随机生成n个0~100的随机数，输出这n个随机数的和
    public static int RandomNumberTotal()
    {
        int result = 0;
        Random r = new Random(67);
        int n = r.nextInt(9) + 1;
        for(int i = 0;i < n;i++)
        {
            result += r.nextInt(101);
        }
        return result;
    }

    // 5.求1000之内的所有完全数。完全数就是一个数恰好等于它的因子之和
    // 例如6的因子为1,2,3，而6=1+2+3，因此6是一个完全数
    public static void PerfectNumber()
    {
        
        for(int i = 1;i < 1000;i++)
        {
            int total = 0;
            int j = i - 1;
            while(j > 0)
            {
                if(i % j == 0)
                    total += j;
                j -= 1;
            }
            if(i == total)
                System.out.println(i);
        }
    }

    // 6.编程求出e=1+1/1!+1/2!+…+1/n!+…的近似值，当1/n!小于0.0001时停止计算。
    public static double CalculateE()
    {
        double number = 1.0;
        double e = 0.0;
        int count = 1;
        while(number > 0.0001)
        {
            e += number;
            number /= count++;
        }
        return e;
    }
}
