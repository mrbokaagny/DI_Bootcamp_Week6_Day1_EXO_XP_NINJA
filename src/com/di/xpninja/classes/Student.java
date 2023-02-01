package com.di.xpninja.classes;

public class Student {

    private int old = 22;
    private int weight = 55;
    private boolean isStudent = false;
    private String gender = "M";
    private String name = "mr boka";

    public Student() {
        super();
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.displayInfo();
    }

    public void displayInfo() {
        System.out.printf("Name : <%s> , Age : <%d ans> , Gender : <%s> , Weight : <%d Kg> , IsStudent : <%s>",
                this.name, this.old, this.gender, this.weight, this.isStudent);
    }
}
