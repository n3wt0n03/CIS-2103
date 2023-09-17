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
    private Date empBirthDate = new Date(1, 1, 2023);;
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
        this.totalSales = totalSales;
    }
    
    double computeSalary() {
        return 0;
    }
    
    public void displayInfo(){
        System.out.println("Commission Employee: \n");
        System.out.println(toString());
        System.out.println(String.format("Salary: %.2f", computeSalary()));
    }

    @Override
    public String toString() {
        return  "ID: " + empID + "\nName: " + empName + 
                "\nDate Hired: " + empDateHired + "\nBirthdate: " + empBirthDate +  
                String.format("\nTotal Sales: %.2f", totalSales);
    }
    
    
}
