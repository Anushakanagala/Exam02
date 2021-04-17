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
public class Loan {
    private String customerid;
    private String customername;
    private String accountnumber;
    private double requiredamount;
    private double rateofinterest;
    
   

    public Loan(String customerid, String customername, String accountnumber, double requiredamount, double rateofinterest) {
        this.customerid = customerid;
        this.customername = customername;
        this.accountnumber = accountnumber;
        this.requiredamount = requiredamount;
        this.rateofinterest = rateofinterest;
        
    }

   
    @Override
    public String toString() {
        return "Loan: " +
                "CustomerId = " + customerid +
                ",CustomerName = "+customername+
                ",AccountNumber = "+accountnumber+
                ", RequiredAmount = " + requiredamount +
                ", Rateofinterest = " + rateofinterest ;
    }
}
