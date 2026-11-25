class Student
{
    private String name;
    private int age;

    Student()
    {
        name = "无名氏";
        age = 20;
    }
    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return this.name;
    }
    void setAge(int age)
    {
        this.age = age;
    }
    int getAge()
    {
        return this.age;
    }
    boolean isSameAge(Student s)
    {
        return this.age == s.age;
    }
    
}

public class StudentClass {
    public static void main(String[] argv)
    {
        Student s = new Student();
        s.setName("nahida");
        s.setAge(12);
        System.out.println(s.getName());
        System.out.println(s.getAge());

        Student s1 = new Student();
        s1.setAge(13);
        System.out.println(s.isSameAge(s1));
    }
}
