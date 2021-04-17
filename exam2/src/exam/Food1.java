/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author S542268
 */
public enum Food1 {
     PIZZA(5),COFFEE(8),CAKE(11),COOKIES(18),DONUT(6); //use an enum constructor, instance variable, and method
     // the values are initisalised 
   
    private int cost;  // decalring a private variable cost of type int
    
    Food1(int c) {cost = c;}  // adding a constructor
     int getcost() {return cost;} //adding a method  
}

class enum2{
    public static void main(String args[]){
        Food1 fd;
        //Displaying the cost of each pizza
        System.out.println("Cost of PIZZA is "+Food1.PIZZA.getcost()+"$ per each.\n");
        
        
        //Displaying cost of all the food types 
        System.out.println("All food costs: ");
        
        for(Food1 a: Food1.values())
            System.out.println(a+" Cost is "+ a.getcost()+"$ per each.");
    }
            
}


