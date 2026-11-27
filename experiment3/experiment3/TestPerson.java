package experiment3;

abstract class Person
{
    protected String name;
    protected String sex;
    protected String birthday;

    Person(String name, String sex, String birthday)
    {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    public void printInfo()
    {
        System.out.println("name: " + name);
        System.out.println("sex: " + sex);
        System.out.println("birthday: " + birthday);
    }
}

class Teacher extends Person
{
    private String school;
    private int id;                  

    Teacher(String school, int id, String name, String sex, String birthday)
    {
        super(name, sex, birthday);  
        this.school = school;
        this.id = id;
    }

    @Override
    public void printInfo()
    {
        System.out.println("the information of teacher:");
        System.out.println("school: " + school);
        System.out.println("id: " + id);
        super.printInfo();           // 复用父类的 name / sex / birthday
    }
}

class Student extends Person
{
    private String school;
    private int id;                  
    private String major;
    private String grade;
    private String className;

    Student(String school, int id, String major, String grade, String className,
            String name, String sex, String birthday)
    {
        super(name, sex, birthday);
        this.school = school;
        this.id = id;
        this.major = major;
        this.grade = grade;
        this.className = className;
    }

    @Override
    public void printInfo()
    {
        System.out.println("the information of student:");
        System.out.println("school: " + school);
        System.out.println("id: " + id);
        System.out.println("major: " + major);
        System.out.println("grade: " + grade);
        System.out.println("class: " + className);
        super.printInfo();
    }
}

public class TestPerson {
    public static void main(String[] args)
    {
        Person teacher = new Teacher("广东石油化工学院", 1001, "纳西妲", "女", "1980-01-01");
        Person student = new Student("广东石油化工学院", 2025138, "计算机科学与技术", "大二",
                                     "计算机25-1", "吴佳鑫", "男", "2007-07-07");

        System.out.println("=== Teacher ===");
        teacher.printInfo();
        System.out.println();
        System.out.println("=== Student ===");
        student.printInfo();
    }
}
