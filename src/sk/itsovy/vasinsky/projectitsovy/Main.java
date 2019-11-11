package sk.itsovy.vasinsky.projectitsovy;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student erik= new Student("Erik","Lorinc", new Date());
        Student filip= new Student("Filip","Andrasik", new Date());
        Group g1= new Group("1N", 5);
        g1.addStudent(erik);
        g1.addStudent(filip);
        g1.print();
    }
}
