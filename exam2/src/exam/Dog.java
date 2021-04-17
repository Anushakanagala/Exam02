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
public class Dog implements Pet,Breed {
    public void animalSound() {
    
            System.out.println("The dog barks: bow bow");  // The body of animalSound() is provided here
    
     } 
     
    public void eat() {
    
           System.out.println("Dog eats: Biscuits"); // The body of eat() is provided here
    
     }
    
    public void breed(){
           System.out.println("Pug"); // The body of breed() is provided here
    }
    
    public void gender(){
           System.out.println("Male"); // The body of gender() is provided here
    }
}
