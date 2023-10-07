package employee.version6;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary = 0;

    public BasePlusCommissionEmployee(){
    }

    public BasePlusCommissionEmployee(double totalSales, double baseSalary) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
    }

    public BasePlusCommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
      return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
      this.baseSalary = baseSalary > 0 ? baseSalary : 0;
    }

    public double computeSalary() {
        double totalSales = super.getTotalSales();
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
        System.out.println(this);
        System.out.printf("Salary: %.2f%n", computeSalary());
    }

    @Override
    public String toString() {
        return  super.toString() +
                String.format("\nBase Salary: %.2f", baseSalary);
    }
}
