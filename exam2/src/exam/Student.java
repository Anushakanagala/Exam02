/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Anusha Kanagala
 */
public class Student extends Person {
    
    private double grade;
    private static final String STATUS = "Graduate";

    public Student(double grade, String name, String address, String phonenumber, String email) {
        super(name, address, phonenumber, email);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }
    
    
    @Override
    public String toString(){
        return "Class Name: " + getClass().getName() + ", Person Name: " + getName();
    }
}
