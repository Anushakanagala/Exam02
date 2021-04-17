/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author Anusha Kanagala
 */
public class ques1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
            
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>();
            
            System.out.println("Answer for question 1: ");
            
            System.out.println("Enter 10 integers: ");
            
            for(int i = 0; i < 10; i++){
                list.add(sc.nextInt());
            }
            

            LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(list);

             
            ArrayList<Integer> newlist = new ArrayList<>(hashSet);

            
            System.out.print("The distinct integers are :");
            
            for(int i = 0; i < newlist.size(); i++){
                System.out.print(newlist.get(i) + " ");
            }
        }
   
    
}
    
    public static void removeDuplicate(ArrayList<Integer> list){
      
      //creating a new arraylist
     ArrayList<Integer>newList = new ArrayList<Integer>();
     

     
         // declaring enhanced for loop 
        // for element a of type integer arraylist list is given to iterate through each element
    for (Integer a:list)
    {
        //If this element is not present in newList then add it
        if(!newList.contains(a))
        {
            newList.add(a);
        }
    }
  }  
    }
    

