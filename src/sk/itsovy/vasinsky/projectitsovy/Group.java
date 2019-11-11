package sk.itsovy.vasinsky.projectitsovy;

import javax.sound.midi.Soundbank;

public class Group {

    private String name;
    private Student[] arr;
    private int capacity;
    private int size;

    public Group(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.size=0;
        this.arr = new Student[capacity];
    }

    public boolean addStudent(Student student){
if (student == null || size ==capacity)
    return false;
arr[size]=student;
size++;
return true;
}


    public String getStudent(String firstName,String lastName){
        return null;
    }

    public void deleteStudent(Student student){

    }
    public void print(){
        System.out.println("List of students ["+name+"] : ");
        for (int i=0;i<size;i++){
            System.out.println("  "+arr[i].toString());
        }
    }



}
