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
public class Staff extends Employee {
     private String title;

    public Staff(String title, String office, double salary, 
                   String dateHired, String name, String address, String phonenumber, String email) {
        super(office, salary, dateHired, name, address, phonenumber, email);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    
    @Override
    public String toString(){
        return "Class Name: " + getClass().getName() + ", Person Name: " + getName();
    }
}
