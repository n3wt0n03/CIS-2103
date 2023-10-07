/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

/**
 *
 * @author NewtskieTzy
 */
public class CommissionEmployee {
    private int empID = 0;
    private String empName = "";
    private Date empDateHired = new Date(1, 1, 2023);
    private Date empBirthDate = new Date(1, 1, 2023);
    private double totalSales = 0;

    public CommissionEmployee() {
    }

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales > 0 ? totalSales : 0;
    }
    
    public double computeSalary() {
      if(totalSales < 50000){
        return totalSales * .05;
      } else if (totalSales >= 50000 && totalSales < 100000){
        return totalSales * .2;
      } else if (totalSales >= 100000 && totalSales < 500000) {
        return totalSales * .3;
      } else {
        return totalSales * .5;
      }
    }
    
    public void displayInfo(){
        System.out.println("\nCommission Employee: \n");
        System.out.println(this);
        System.out.printf("Salary: %.2f%n", computeSalary());
    }

    @Override
    public String toString() {
        return  "ID: " + empID + "\nName: " + empName + 
                "\nDate Hired: " + empDateHired + "\nBirthdate: " + empBirthDate +  
                String.format("\nTotal Sales: %.2f", totalSales);
    }
    
    
}
