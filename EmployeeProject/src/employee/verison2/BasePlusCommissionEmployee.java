package employee.verison2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NewtskieTzy
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary = 0;

    public BasePlusCommissionEmployee(double totalSales, double baseSalary) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(double baseSalary){
      return baseSalary;
    }

    public void setBaseSalary(){
      this.baseSalary = baseSalary > 0 ? baseSalary : 0;
    }

    public double computeSalary() {
        double totalSales = getTotalSales();
      if(totalSales < 50000){
        totalSales *= .05;
      } else if (totalSales >= 50000 && totalSales < 100000){
        totalSales *= .2;
      } else if (totalSales >= 100000 && totalSales < 500000) {
        totalSales *= .3;
      } else {
        totalSales *= .5;
      }
      baseSalary += totalSales;

      return baseSalary;
    }

    public void displayInfo(){
        System.out.println("Base Plus Commission Employee: \n");
        System.out.println(this);
        System.out.printf("Salary: %.2f%n", computeSalary());
    }

    @Override
    public String toString() {
        return  super.toString() +
                String.format("\nBase Salary: %.2f", baseSalary);
    }
}
