package package2;

import package1.classA;

public class classB
{
    public void methodB()
    {
        classA a = new classA();
        a.methodA();
        System.out.println("methodB");
    }
}
