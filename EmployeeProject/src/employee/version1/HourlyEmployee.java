/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;


/**
 *
 * @author User
 */
public class HourlyEmployee {
    private int empID = 0;
    private String empName = "";
    private Date empDateHired = new Date(1, 1, 2023);
    private Date empBirthDate = new Date(1, 1, 2023); 
    private float totalHourWorked = 0;
    private float ratePerHour = 0;
    private double hrsOvertime = 0;
    private double overtimePay = 0;

    public HourlyEmployee() {
        
    }

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float totalHourWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHourWorked = totalHourWorked;
        this.ratePerHour = ratePerHour;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    //8 hours times 5 days in a week results to 40 hours
    public void setTotalHourWorked(float totalHourWorked) {
        this.totalHourWorked = totalHourWorked < 0 ? 0 : totalHourWorked;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour < 0 ? 0 : ratePerHour;
    }

    public void setHrsOvertime(double hrsOvertime) {
        this.hrsOvertime = hrsOvertime;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public float getTotalHourWorked() {
        return totalHourWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
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
            //(75*5)* 1.5 = 562.5-> OT Pay
            this.hrsOvertime = totalHourWorked - 40;  
            this.overtimePay = (hrsOvertime*ratePerHour)*1.5;
            salary = (ratePerHour*40) + overtimePay;
        }
        return salary;
    }
    
    public void displayInfo(){
        System.out.println("Hourly Employee: \n");
        System.out.println(toString());
        System.out.println(String.format("Salary: %.2f", computeSalary()));
        System.out.println(String.format("Overtime Pay: %.2f\n", getOvertimePay()));
    }

    @Override
    public String toString() {
        return  "ID: " + empID + "\nName: " + empName + 
                "\nDate Hired: " + empDateHired + "\nBirthdate: " + empBirthDate + 
                String.format("\nTotal hours worked: %.2f", totalHourWorked) + 
                String.format("\nRate per hour: %.2f", ratePerHour);
    }
    
    
}




