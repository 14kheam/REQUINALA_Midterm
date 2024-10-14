class Person { //Base Class
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person { //Subclass of Person
    String studentID;
    String course;
    int units;
    final int feePerUnit = 1000;

    Student(String name, int age, String studentID, String course, int units) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    double calculateFees() {
        return units * feePerUnit;
    }

    @Override
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + calculateFees());
    }
}

class Instructor extends Person { //Subclass of Person
    //Fields
    String employeeID;
    String department;
    double salary;

    Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    //Methods to Print Information for each Instructor
    @Override
    void displayInfo() {
        System.out.println("Instructor Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID); 
        System.out.println(" Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class EnrollmentSystem {
    static void printDetails(Person p) {
        p.displayInfo();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Kheam Airah Requinala", 19, "231000338", "Computer Engineering", 5);
        Student student2 = new Student("Sophia Jessica Toraldo", 20, "231002299", "Ab English", 4);
        Instructor instructor1 = new Instructor("Engr. Tanya Carmela Jovillano", 22, "XYZ22302420", "College of Arts and Sciences", 75000);
        Instructor instructor2 = new Instructor("Engr. Mariam Angela Caning", 23, "XYZ23082024", "College of Engineering Architecture", 20000);

        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
}