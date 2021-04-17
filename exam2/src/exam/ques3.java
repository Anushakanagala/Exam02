/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.ArrayList;
import java.util.Date;

/**
 *1
 * @author Anusha Kanagala
 */
public class ques3 {

    /**
     * @param args the command line arguments
     */
    
           public static void main(String[] args) {
       	// Create an array list of objects
		ArrayList<Object> o = new ArrayList<Object>();
		o.add(new Loan("SBI", "Anusha", "39195991918", 180000, 1.89));		
		o.add(new Date());		
	        o.add(new Circle(2.5));	

		// Display all the elements in the list by 
		// invoking the object’s toString() method
		for (int i = 0; i < o.size(); i++) {
			System.out.println((o.get(i)).toString());
		}
	}
    }
    

