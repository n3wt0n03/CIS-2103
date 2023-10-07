package employee.version4;

public class HourlyEmployee extends Employee {
    private float totalHourWorked = 0;
    private float ratePerHour = 0;
    private double hrsOvertime = 0;
    private double overtimePay = 0;

    public HourlyEmployee(){

    }

    public HourlyEmployee(float totalHourWorked, float ratePerHour) {
        this.totalHourWorked = totalHourWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, float totalHourWorked, float ratePerHour) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHourWorked = totalHourWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHourWorked() {
        return totalHourWorked;
    }

    //8 hours times 5 days in a week results to 40 hours
    public void setTotalHourWorked(float totalHourWorked) {
        this.totalHourWorked = totalHourWorked < 0 ? 0 : totalHourWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour < 0 ? 0 : ratePerHour;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public double computeSalary(){
        double salary;

        if(totalHourWorked == 0 || totalHourWorked <= 40) {
            // 75*15 = 1,125
            salary = totalHourWorked * ratePerHour;
            this.overtimePay = 0;
        } else {
            //(75*5) * 1.5 = 562.5-> OT Pay
            //(75*40) + 562.5 = 3562.5 -> Salary with OT Pay
            this.hrsOvertime = totalHourWorked - 40;
            this.overtimePay = (hrsOvertime*ratePerHour)*1.5;
            salary = (ratePerHour*40) + overtimePay;
        }
        return salary;
    }

    public void displayInfo(){
        System.out.println(this);
        System.out.printf("Salary: %.2f%n", computeSalary());
        System.out.printf("Overtime Pay: %.2f\n%n", getOvertimePay());
    }

    @Override
    public String toString() {
        return  super.toString() +
                String.format("\nTotal hours worked: %.2f", totalHourWorked) +
                String.format("\nRate per hour: %.2f", ratePerHour);
    }


}

