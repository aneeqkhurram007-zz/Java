package com.bitspedia.Student;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Course course = new Course("CSC 131", "Programming");

        Address address = new Address("H#18", "Younas Pura", "Lahore", "Pakistan");

        Student student1 = new Student(35201, "Aneeq", address);
        System.out.print("How many phone number do you have: ");

        student1.setPhoneNumber(input.nextInt());

        student1.setCourse1(course);
        student1.setEmail("aneeqkhurram007@gmail.com");
        student1.setCourse2(new Course("Isl 431", "Islamiyat"));
        student1.display();

        Student student2 = new Student(35202, "Murshad", address);
        System.out.print("\nHow many phone number do you have: ");

        student2.setPhoneNumber(input.nextInt());

        student2.setCourse1(course);
        student2.setEmail("aneeqkhurram007@yahoo.com");
        student2.setCourse2(new Course("Isl 431", "Islamiyat"));
        student2.display();

        input.close();
    }
}
