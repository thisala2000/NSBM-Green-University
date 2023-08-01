package com.mycompany.practical4_3;

public class TestPerson
 {
    public static void main(String[] args)
     {
        Student student = new Student();
        student.setName("stive");
        student.setID(1);
        student.setCourse("Computer achitecture");


        Lecturer lecturer = new Lecturer();
        lecturer.setName("Dr.methews");
        lecturer.setID(1001);
        lecturer.setProg("network Engineering");


        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getID());
        System.out.println("Course: " + student.getCourse());
        System.out.println();


        System.out.println("Lecturer Details:");
        System.out.println("Name: " + lecturer.getName());
        System.out.println("ID: " + lecturer.getID());
        System.out.println("Programme: " + lecturer.getProg());
    }
}
