package com.example.demo;

public class Student extends Person {
    private int number;
    private int yearInCollege;

    public Student(int number, int yearInCollege,  String firstName, String lastName) {
        this.number = number;
        this.yearInCollege = yearInCollege;
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String addressedAsName(){
        return(super.getFirstName() + " " + super.getLastName());
    }

    @Override
    public String toString() {
        return
                "Student [number=" + number + ", " +
                        "yearInCollege=" + yearInCollege + ", " +
                        "firstName=" + getFirstName() + ", " +
                        "lastName=" + getLastName() + "]";
    }
}
