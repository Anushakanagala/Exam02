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
public class BankTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Bank bank;  
        
        bank=new AXIS();  
        
        System.out.println("Rate of Interest is: "+bank.getRateOfInterest()+" %");    

        bank=new KYB();  
        
        System.out.println("Rate of Interest is: "+bank.getRateOfInterest()+" %");    

    
    }

    }
    

