package Practice.OOP.Model;

public class Student extends Person {
    public String email;
    public double pointAverage;
    public boolean isEnrolled;
    
    public Student(String firstName, String secondName, int age, String email, double pointAverage) {
        super(firstName, secondName, age);
        this.email = email;
        this.age = age;
        this.pointAverage = pointAverage;   
        this.isEnrolled = true;
    }
    public Student(String firstName, String secondName, int age, String email) {
        super(firstName, secondName, age);
        this.email = email;
        this.age = age;
        this.isEnrolled = true;
    }

    public Student(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
        this.email = null;
        this.pointAverage = Double.NaN;
        this.isEnrolled = true;
    }
}
