package employee.version6;

import java.util.ArrayList;
import java.util.Objects;

public class EmployeeRoster {
    ArrayList<Employee> empList = new ArrayList<Employee>(); // turns the Employees into an Array of Employees

    public EmployeeRoster(){
    }

    public ArrayList<Employee> getEmpList(){
        return empList;
    }

    public void displayEmployees(){
        System.out.printf("%-10s | %-40s | %-30s | %-20s\n", "ID", "NAME", "TYPE", "SALARY");
        for (Employee emp : empList){
            String fullName = String.valueOf(emp.getEmpName());
            String type = emp.getClass().getSimpleName();

            //accesses the computeSalary() method of abstract class Employee
            //when accessing an abstract method, there is no need in typecasting
            double salary = emp.computeSalary();

            System.out.printf("%-10s | %-40s | %-30s | %-20.2f\n", emp.getEmpID(), fullName, type, salary);
        }
    }

    public int countHE(){
        int countHE = 0;
        for (Employee emp : empList){
            if (emp instanceof HourlyEmployee){
                countHE++;
            }
        }

        return countHE;
    }

    public int countPWE(){
        int countPWE = 0;
        for (Employee emp : empList){
            if (emp instanceof PieceWorkerEmployee){
                countPWE++;
            }
        }

        return countPWE;
    }

    public int countCE(){
        int countCE = 0;
        for (Employee emp : empList){
            if (emp instanceof CommissionEmployee && !(emp instanceof BasePlusCommissionEmployee)){
                countCE++;
            }
        }

        return countCE;
    }

    public int countBPCE(){
        int countBPEC = 0;
        for (Employee emp : empList){
            if (emp instanceof BasePlusCommissionEmployee){
                countBPEC++;
            }
        }

        return countBPEC;
    }

    public void displayHE(){
        System.out.println("\nHOURLY EMPLOYEE LIST: ");
        for (Employee emp : empList) {
            if(emp instanceof HourlyEmployee){
                 ((HourlyEmployee) emp).displayInfo();
            }
        }
    }

    public void displayPWE(){
        System.out.println("\nPIECE WORKER EMPLOYEE LIST: ");
        for (Employee emp : empList) {
            if(emp instanceof PieceWorkerEmployee){
                 ((PieceWorkerEmployee) emp).displayInfo();
            }
        }
    }

    public void displayCE(){
        System.out.println("\nCOMMISSION EMPLOYEE LIST: ");
        for (Employee emp : empList) {
            if(emp instanceof CommissionEmployee && !(emp instanceof BasePlusCommissionEmployee)){
                ((CommissionEmployee) emp).displayInfo();
            }
        }
    }

    public void displayBPCE(){
        System.out.println("\nBASE PLUS COMMISSION EMPLOYEE LIST: ");
        for (Employee emp : empList) {
            if(emp instanceof BasePlusCommissionEmployee){
                ((BasePlusCommissionEmployee) emp).displayInfo();
            }
        }
    }

    public boolean addEmployee(Employee e){
        boolean isEmpAdded = empList.add(e);
        if(isEmpAdded){
            System.out.println("Added Employee = True");
        }  else {
            System.out.println("Added Employee = False");
        }
        return isEmpAdded;
    }

    public boolean deleteEmployee(int id){
        boolean isEmpDeleted = empList.removeIf(emp -> emp.getEmpID() == id);
        if(isEmpDeleted){
            System.out.println("\nDeleted Successfully");
        }  else {
            System.out.println("\nDeleted Unsuccessful");
        }
        return isEmpDeleted;

    }

    //Update Method for Name
    public boolean updateEmployeeName(int id, String newFN, String newLN, String newMN){
        for (Employee emp: empList) {
            if (id == emp.getEmpID()){
                if (!Objects.equals(newFN, emp.getEmpName().getFname()) || Objects.equals(newFN, "")) {
                    emp.getEmpName().setFname(newFN);
                }
                if (!Objects.equals(newLN, emp.getEmpName().getLname()) || Objects.equals(newLN, "")){
                    emp.getEmpName().setLname(newLN);
                }
                if (!Objects.equals(newMN, emp.getEmpName().getMname()) || Objects.equals(newMN, "")){
                    emp.getEmpName().setMname(newMN);
                }
                return true;
            }
        }
        return false;
    }

    //Separate Method Commission Employee Changes
    public boolean updateEmployee(int id, String newFN, String newLN, String newMN, double totalSales){
        for (Employee emp: empList) {
            if(emp instanceof CommissionEmployee){
                //Access the updateEmployeeName method when needed to update the name
                updateEmployeeName(id, newFN, newLN, newMN);

                if(totalSales != ((CommissionEmployee) emp).getTotalSales()){
                    ((CommissionEmployee) emp).setTotalSales((totalSales));
                } else {
                    System.out.println("Updated Unsuccessfully\n!");
                    return false;
                }
                System.out.printf("Employee %d is updated\n", emp.getEmpID());
                return true;
            }
        }
        return false;
    }

    //Update Method for HE, PWE, and BPCE
    public boolean updateEmployee(int id, String newFN, String newLN, String newMN, double rateOrSales, double totalOrBase){
        for (Employee emp: empList) {
            if(id == emp.getEmpID()){
                //Access the updateEmployeeName method when needed to update the name
                updateEmployeeName(id, newFN, newLN, newMN);

                //Hourly Employee Changes
                if(emp instanceof HourlyEmployee){
                    if (rateOrSales != ((HourlyEmployee) emp).getRatePerHour()){
                        ((HourlyEmployee) emp).setRatePerHour((float)rateOrSales);
                    }
                    if(totalOrBase != ((HourlyEmployee) emp).getTotalHourWorked()){
                        ((HourlyEmployee) emp).setTotalHourWorked((float)totalOrBase);
                    }
                }

                //PieceWorker Employee Changes
                else if (emp instanceof PieceWorkerEmployee){
                    if (rateOrSales != ((PieceWorkerEmployee) emp).getRatePerPiece()){
                        ((PieceWorkerEmployee) emp).setRatePerPiece((float)rateOrSales);
                    }
                    if(totalOrBase != ((PieceWorkerEmployee) emp).getTotalPiecesFinished()){
                        ((PieceWorkerEmployee) emp).setTotalPiecesFinished((int)totalOrBase);
                    }
                }

                //Base Plus Commission Employee Changes
                else if (emp instanceof BasePlusCommissionEmployee){
                    if (rateOrSales != ((BasePlusCommissionEmployee) emp).getTotalSales()){
                        ((BasePlusCommissionEmployee) emp).setTotalSales(rateOrSales);
                    }
                    if(totalOrBase != ((BasePlusCommissionEmployee) emp).getBaseSalary()){
                        ((BasePlusCommissionEmployee) emp).setBaseSalary(totalOrBase);
                    }
                } else {
                    System.out.println("\nUpdated Unsuccessfully!");
                    return false;
                }
                System.out.printf("Employee %d is updated\n", emp.getEmpID());
                return true;
            }
        }
        return false;
    }

    public EmployeeRoster getEmployee(String get){
        EmployeeRoster list = new EmployeeRoster(); //create and return as a new instance
        get = get.toLowerCase();
        String idAndName = null;

        for (Employee emp: empList) {
            idAndName = emp.getEmpID() + String.valueOf(emp.getEmpName()).toLowerCase();
            if(idAndName.contains(get)){
                System.out.println("\nEmployee is found in the list!");
                list.addEmployee(emp);
            }
        }
         if(idAndName.isEmpty()){
             System.out.println("Employee is not found in the list!");
         }
        return list;
    }
}
