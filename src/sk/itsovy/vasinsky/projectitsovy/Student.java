package sk.itsovy.vasinsky.projectitsovy;

import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private Date birthdate;

    public Student(String firstName, String lastName, Date birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }
    public String toString(){
        return firstName+" "+ lastName;

    }



}
