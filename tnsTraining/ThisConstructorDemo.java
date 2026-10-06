package tnsTraining;

class Student {

    String name;
    int age;

    Student() {
        this("Rahul", 20);
        System.out.println("Default constructor called");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class ThisConstructorDemo.java {

    public static void main(String[]args) {

       new Student();
        
    }
}