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
public enum Transport1 {
     CAR,BUS,TRAIN,BOAT,PLANE  // enumeration of Transport
}

class enum1{
    public static void main(String args[]){
        Transport1 trans;
        trans=Transport1.BUS;  //assigning trans the constant BUS 
        
        System.out.println("Type of trnas: "+trans); //prints type of trans
        System.out.println();
        
        
        trans= Transport1.BOAT; // assigning trans the constant BOAT 
        
        if(trans==Transport1.BOAT) // COMPARING TWO VALUES OF TRAns
        {
            System.out.println("trans contians BOAT"); 
            System.out.println();
        }
        
        
        switch(trans){ //enum is used to control 
            case CAR:
                System.out.println("A car carries 5 people");
                
                break;
                
            case BUS:
                System.out.println("BUS is a public transport");
                
                break;
            
            case TRAIN:
                System.out.println("A train runs on track");
                
                break; 
                
            case BOAT:
                System.out.println("A boat sails on water");
                
                break;
                
            case PLANE:
                System.out.println("A plane is being operated by pilot");
                
                break;    
        }
        
    }

}

