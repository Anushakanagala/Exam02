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
public class Professor {
   private String designation ;
  
   private String collegeName ;
   
  
   public Professor(String designation, String collegeName){
       this.designation=designation;
       this.collegeName = collegeName;
   }
   
   
   public String getDesignation(){
       return designation;
   }
   
   
   public String getCollegeName(){
       return collegeName;
   }
   
   
   @Override
    public String toString(){
        return "Designation: " + getDesignation() + ", College Name: " + getCollegeName();
}
}
