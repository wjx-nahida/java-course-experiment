package experiment3;

abstract class Animal
{
    protected String name;
    protected int age;
    protected double weight;

    Animal(String name, int age, double weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void showInfo()
    {
        System.out.println("name: " + name + " age: " + age + " weight: " + weight);
    }

    public abstract void move();
    public abstract void eat();
}

class Bird extends Animal
{
    Bird(String name, int age, double weight)
    {
        super(name, age, weight);
    }

    @Override
    public void showInfo()
    {
        System.out.println("the information of bird:");
        super.showInfo();
    }

    @Override
    public void move()
    {
        System.out.println("the bird move method is fly");
    }

    @Override
    public void eat()
    {
        System.out.println("the bird favourite food is worm");
    }
}

public class TestAnimal {
    public static void main(String[] args)
    {
        Animal a = new Bird("小鸟", 2, 23);
        a.showInfo();
        a.move();
        a.eat();
    }
}
