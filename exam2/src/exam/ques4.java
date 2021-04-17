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
public class ques4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Professor professor = new Professor("Associate", "Bhojreddy Engineering College");
       Professor  professordetails = new Professordetails("Prashnathi", 1000000.0, 13, "Associate", "Bhojreddy Engineering College"  );
       
      System.out.println(professor.toString());
       
       System.out.println(professordetails.toString());
    }
    
}
