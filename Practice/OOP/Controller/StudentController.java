package Practice.OOP.Controller;

import Practice.OOP.Model.Student;

public class StudentController {
    public static void main(String[] args) {
        Student student1 = new Student("Denis", "Shamko", 22, "denis@mail.ru", 3.2);
        Student student2 = new Student("Katya", "Briskova", 22, "katya@mail.ru", 4.7);
        Student student3 = new Student("Chape", "Ullah", 25);
        System.out.println(student1.pointAverage + " " + student2.pointAverage + " " + student3.pointAverage);
    }
}
