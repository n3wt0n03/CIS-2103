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
public class BankAccount {
    //details for an account
    private int accNumber;
    private double accBalance = 100;
    private String accName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
    }

    public BankAccount(int accNumber, double accBalance, String accName, String email, String phoneNumber) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
        this.accName = accName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public String getAccName() {
        return accName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }  

    public boolean deposit(double depAmount){
        if (depAmount > 0){
            accBalance += depAmount;
            System.out.println("Deposit Succesful\n");
            return true;
        } else {
            System.out.println("Invalid deposit amount. Unsuccessful Withdrawal\n");
            return false;
        }
    }
    
    public boolean withdraw(double withdAmount){
        if (withdAmount > 0 ){
            if(withdAmount == getAccBalance()){
               System.out.println("Account Balance will be zero. Unsuccessful Withdrawal\n");
               return false;
            }
            accBalance -= withdAmount;
            System.out.println("Withdraw Succesful\n");                
            return true;
        } else {
            System.out.println("Invalid withdrawal amount. Unsuccessful Withdrawal\n");
            return false;
        }
    }
    
    @Override
    public String toString() {
        return String.format("Account Number: " + accNumber + "\nAccount Name: " 
                + accName + "\nAccount Email: " + email + "\nAccount Phone Number: " 
                + phoneNumber + "\nYour account Balance is: " + accBalance + "\n");
    }
}
