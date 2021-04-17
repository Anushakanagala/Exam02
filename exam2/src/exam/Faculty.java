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
public class Faculty extends Employee {
     private int officeHours;
    private int teachingsubjects;

    public Faculty(int officeHours, int teachingsubjects, String office, double salary, String dateHired, String name, String address, String phonenumber, String email) {
        super(office, salary, dateHired, name, address, phonenumber, email);
        this.officeHours = officeHours;
        this.teachingsubjects = teachingsubjects;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public int getTeachingSubjects() {
        return teachingsubjects;
    }
    
    
    @Override
    public String toString(){
        return "Class Name: " + getClass().getName() + ", Person Name: " + getName();
    }
}
