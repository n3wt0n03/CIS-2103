package employee.version4;

import java.util.Objects;

public class EmployeeRoster {
    Employee[] empList; // turns the Employees into an Array of Employees
    int count = 0;// Counts how many Employees are present
    int max; // Maximum Employees in the array

    //If not set, make the default max to 10
    public EmployeeRoster(){
        this.max = 10;
        empList = new Employee[this.max];
    }

    //If set, make it as the max of the employees in the array
    public EmployeeRoster(int max){
        this.max = max;
        empList = new Employee[this.max];
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public int getCount() {
        return count;
    }

    public int getMax() {
        return max;
    }

    public void displayEmployees(){
        System.out.printf("%-10s | %-40s | %-30s | %-20s\n", "ID", "NAME", "TYPE", "SALARY");
        for (int i = 0; i < count; i++){
            Employee emp = empList[i];
            String fullName = String.valueOf(emp.getEmpName());
            String type = emp.getClass().getSimpleName();
            double salary = 0;

            if(emp instanceof HourlyEmployee) {
                salary = ((HourlyEmployee) emp).computeSalary();
            } else if(emp instanceof PieceWorkerEmployee){
                salary = ((PieceWorkerEmployee) emp).computeSalary();
            } else if(emp instanceof CommissionEmployee){
                if (emp instanceof BasePlusCommissionEmployee){
                    salary = ((BasePlusCommissionEmployee) emp).computeSalary();
                } else {
                    salary = ((CommissionEmployee) emp).computeSalary();
                }
            }

            System.out.printf("%-10s | %-40s | %-30s | %-20.2f\n", emp.getEmpID(), fullName, type, salary);
        }
    }

    public int countHE(){
        int countHE = 0;
        for (int i = 0; i < count; i++){
            if (empList[i] instanceof HourlyEmployee){
                countHE++;
            }
        }

        return countHE;
    }

    public int countPWE(){
        int countPWE = 0;
        for (int i = 0; i < count; i++){
            if (empList[i] instanceof PieceWorkerEmployee){
                countPWE++;
            }
        }

        return countPWE;
    }

    public int countCE(){
        int countCE = 0;
        for (int i = 0; i < count; i++){
            if (empList[i] instanceof CommissionEmployee && !(empList[i] instanceof BasePlusCommissionEmployee)){
                countCE++;
            }
        }

        return countCE;
    }

    public int countBPCE(){
        int countBPEC = 0;
        for (int i = 0; i < count; i++){
            if (empList[i] instanceof BasePlusCommissionEmployee){
                countBPEC++;
            }
        }

        return countBPEC;
    }

    public void displayHE(){
        System.out.println("\nHOURLY EMPLOYEE LIST: ");
        for (int i = 0; i < count; i++) {
            if(empList[i] instanceof HourlyEmployee){
                ((HourlyEmployee) empList[i]).displayInfo();
            }
        }
    }

    public void displayPWE(){
        System.out.println("\nPIECE WORKER EMPLOYEE LIST: ");
        for (int i = 0; i < count; i++) {
            if(empList[i] instanceof PieceWorkerEmployee){
                ((PieceWorkerEmployee) empList[i]).displayInfo();
            }
        }
    }

    public void displayCE(){
        System.out.println("\nCOMMISSION EMPLOYEE LIST: ");
        for (int i = 0; i < count; i++) {
            if(empList[i] instanceof CommissionEmployee && !(empList[i] instanceof BasePlusCommissionEmployee)){
                ((CommissionEmployee) empList[i]).displayInfo();
            }
        }
    }

    public void displayBPCE(){
        System.out.println("\nBASE PLUS COMMISSION EMPLOYEE LIST: ");
        for (int i = 0; i < count; i++) {
            if(empList[i] instanceof BasePlusCommissionEmployee){
                ((BasePlusCommissionEmployee) empList[i]).displayInfo();
            }
        }
    }

    public boolean addEmployee(Employee e, boolean isAdded){
        if(count >= max){
            System.out.println("List is already full!");
            return false;
        }
        empList[count] = e;
        count++;
        System.out.println("Added Employee = " + isAdded);
        return true;
    }

    public boolean deleteEmployee(int id){
        for (int i = 0; i <= count ; i++) {
            if(id == empList[i].getEmpID()){
                for (int j = i; j <= count-1; j++) {
                    empList[j] = empList[j+1];
                }
                empList[count - 1] = null;
                --count;
                System.out.printf("Successfully deleted %d!\n", id);
                return true;
            }
        }
        System.out.println("Deleted unsuccessfully!\n");
        return false;
    }

    //Update Method for Name
    public boolean updateEmployeeName(int id, String newFN, String newLN, String newMN){
        for (int i = 0; i < count; i++) {
            if (id == empList[i].getEmpID()){
                if (!Objects.equals(newFN, empList[i].getEmpName().getFname()) || Objects.equals(newFN, "")) {
                    empList[i].getEmpName().setFname(newFN);
                }
                if (!Objects.equals(newLN, empList[i].getEmpName().getLname()) || Objects.equals(newLN, "")){
                    empList[i].getEmpName().setLname(newLN);
                }
                if (!Objects.equals(newMN, empList[i].getEmpName().getMname()) || Objects.equals(newMN, "")){
                    empList[i].getEmpName().setMname(newMN);
                }
                return true;
            }
        }
        return false;
    }

    //Separate Method Commission Employee Changes
    public boolean updateEmployee(int id, String newFN, String newLN, String newMN, double totalSales){
        for (int i = 0; i < count; i++) {
            if(empList[i] instanceof CommissionEmployee){
                //Access the updateEmployeeName method when needed to update the name
                updateEmployeeName(id, newFN, newLN, newMN);

                if(totalSales != ((CommissionEmployee) empList[i]).getTotalSales()){
                    ((CommissionEmployee) empList[i]).setTotalSales((totalSales));
                } else {
                    System.out.println("Updated Unsuccessfully\n!");
                    return false;
                }
                System.out.printf("Employee %d is updated\n", empList[i].getEmpID());
                return true;
            }
        }
        return false;
    }

    //Update Method for HE, PWE, and BPCE
    public boolean updateEmployee(int id, String newFN, String newLN, String newMN, double rateOrSales, double totalOrBase){
        for (int i = 0; i < count ; i++) {
            if(id == empList[i].getEmpID()){
                //Access the updateEmployeeName method when needed to update the name
                updateEmployeeName(id, newFN, newLN, newMN);

                //Hourly Employee Changes
                if(empList[i] instanceof HourlyEmployee){
                    if (rateOrSales != ((HourlyEmployee) empList[i]).getRatePerHour()){
                        ((HourlyEmployee) empList[i]).setRatePerHour((float)rateOrSales);
                    }
                    if(totalOrBase != ((HourlyEmployee) empList[i]).getTotalHourWorked()){
                        ((HourlyEmployee) empList[i]).setTotalHourWorked((float)totalOrBase);
                    }
                }

                //PieceWorker Employee Changes
                else if (empList[i] instanceof PieceWorkerEmployee){
                    if (rateOrSales != ((PieceWorkerEmployee) empList[i]).getRatePerPiece()){
                        ((PieceWorkerEmployee) empList[i]).setRatePerPiece((float)rateOrSales);
                    }
                    if(totalOrBase != ((PieceWorkerEmployee) empList[i]).getTotalPiecesFinished()){
                        ((PieceWorkerEmployee) empList[i]).setTotalPiecesFinished((int)totalOrBase);
                    }
                }

                //Base Plus Commission Employee Changes
                else if (empList[i] instanceof BasePlusCommissionEmployee){
                    if (rateOrSales != ((BasePlusCommissionEmployee) empList[i]).getTotalSales()){
                        ((BasePlusCommissionEmployee) empList[i]).setTotalSales(rateOrSales);
                    }
                    if(totalOrBase != ((BasePlusCommissionEmployee) empList[i]).getBaseSalary()){
                        ((BasePlusCommissionEmployee) empList[i]).setBaseSalary(totalOrBase);
                    }
                } else {
                    System.out.println("Updated Unsuccessfully!\n");
                    return false;
                }
                System.out.printf("Employee %d is updated\n", empList[i].getEmpID());
                return true;
            }
        }
        return false;
    }

    public EmployeeRoster getEmployee(String get){
        EmployeeRoster list = new EmployeeRoster(count); //create and return as a new instance
        get = get.toLowerCase();
        String idAndName = null;

        for (int i = 0; i < count; i++) {
            idAndName = empList[i].getEmpID() + String.valueOf(empList[i].getEmpName()).toLowerCase();
            if(idAndName.contains(get)){
                System.out.println("\nEmployee is found in the list!");
                list.addEmployee(empList[i], true);
            }
        }
         if(idAndName.isEmpty()){
             System.out.println("Employee is not found in the list!");
         }
        return list;
    }
}
