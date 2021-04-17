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
public class Person {
    private String name;
    private String address;
    private String phonenumber;
    private String email;

   
    
    public Person(String name, String address, String phonenumber, String email) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
    }

   
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getEmail() {
        return email;
    }
    
    
    
    @Override
    public String toString(){
        return "Class Name: " + getClass().getName() + ", Person Name: " + name;
    }
    
}
