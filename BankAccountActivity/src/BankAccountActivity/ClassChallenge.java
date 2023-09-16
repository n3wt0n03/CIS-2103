/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccountActivity;


/**
 *
 * @author NewtskieTzy
 */
public class ClassChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
        //Instance for the class BankAccount
        BankAccount acc = new BankAccount();
        
        //No value except account balance because it is static
        System.out.println(acc);
        
        //setting up account
        acc.setAccNumber(120303);
        acc.setAccName("Marc Nelson B. Ochavo");
        acc.setEmail("marcnelsonochavo@gmail.com");
        acc.setPhoneNumber("09175770736");
        
        System.out.println(acc);
        
        //tries to withdraw if the amount is equal to the account balance
        acc.withdraw(100);
        System.out.println(acc);
        
        //tries to withdraw if the amount is a negative number
        acc.withdraw(-99);
        System.out.println(acc);
        
        //tries to withdraw if the amount is lower than the account balance
        acc.withdraw(99);
        System.out.println(acc);
        
        //tries to deposit above 0
        acc.deposit(100000);
        System.out.println(acc);
        
        //tries to deposit below 0
        acc.deposit(-100);
        System.out.println(acc);
       

   
        
         
    }
    
    
    
}
