/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;

/**
 *
 * @author NewtskieTzy
 */
public class CommissionEmployee extends Employee {
    private double totalSales = 0;

    public CommissionEmployee(double totalSales) {
        this.totalSales = totalSales;
    }

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales > 0 ? totalSales : 0;
    }

    double computeSalary() {
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
        System.out.println(toString());
        System.out.printf("Salary: %.2f%n", computeSalary());
    }

    @Override
    public String toString() {
        return  super.toString() +
                String.format("\nTotal Sales: %.2f", totalSales);
    }
}
