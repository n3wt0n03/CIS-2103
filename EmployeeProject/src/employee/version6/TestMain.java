package employee.version6;


//Check if the ID will be needed to type or not
public class TestMain {
    public static void main(String[] args){
        EmployeeRoster list = new EmployeeRoster();

        //Add all the employees first per type
        //HOURLY EMPLOYEE
        list.addEmployee(new HourlyEmployee(1, new Name("Marc", "Ochavo", "Berina"),
                new Date(16, 4, 2022), (new Date(3, 12, 2003)), 15, 75));

        list.addEmployee(new HourlyEmployee(2, new Name("Mr.", "Nelson", "Ochavo", "Miasco", ""),
                new Date(3, 12, 2003), (new Date(8, 9, 1973)), 45, 75));

        //PIECE WORKER EMPLOYEE
        list.addEmployee(new PieceWorkerEmployee(3, new Name("", "Nicolas", "Ochavo", "Berina", "Jr.")
                , new Date(14, 9 ,2022), new Date(5, 3 ,2002), 100, 95));

        list.addEmployee(new PieceWorkerEmployee(4, new Name("Engr.", "Marcy", "Ochavo", "Berina", "Sr.")
                , new Date(5, 3, 2002), new Date(15, 12, 1972), 95, 95));

        //COMMISSION EMPLOYEE

        //less than 50k
        list.addEmployee(new CommissionEmployee());
        list.empList.get(list.empList.size() - 1).setEmpID(5);
        list.empList.get(list.empList.size() - 1).setEmpName(new Name("Marjhun", "Galanido", "Berina"));
        list.empList.get(list.empList.size() - 1).setEmpDateHired(new Date(22, 10, 2019));
        list.empList.get(list.empList.size() - 1).setEmpBirthDate(new Date(20, 12, 1993));
        ((CommissionEmployee)list.empList.get(list.empList.size() - 1)).setTotalSales(49000);


        //greater or equal to 50k but less than 100k
        list.addEmployee(new CommissionEmployee());
        list.empList.get(list.empList.size() - 1).setEmpID(6);
        list.empList.get(list.empList.size() - 1).setEmpName(new Name("Ella", "Galanido", "Adolfo"));
        list.empList.get(list.empList.size() - 1).setEmpDateHired(new Date(1, 6, 2018));
        list.empList.get(list.empList.size() - 1).setEmpBirthDate(new Date(26, 11, 1993));
        ((CommissionEmployee)list.empList.get(list.empList.size() - 1)).setTotalSales(85000.50);

        //greater or equal to 100k but less than 500k
        list.addEmployee(new CommissionEmployee());
        list.empList.get(list.empList.size() - 1).setEmpID(7);
        list.empList.get(list.empList.size() - 1).setEmpName(new Name("King", "Galanido", "Berina"));
        list.empList.get(list.empList.size() - 1).setEmpDateHired(new Date(1, 6, 2023));
        list.empList.get(list.empList.size() - 1).setEmpBirthDate(new Date(20, 10, 2021));
        ((CommissionEmployee)list.empList.get(list.empList.size() - 1)).setTotalSales(499999.99);

        //greater than 500k onwards
        list.addEmployee(new CommissionEmployee());
        list.empList.get(list.empList.size() - 1).setEmpID(8);
        list.empList.get(list.empList.size() - 1).setEmpName(new Name("Christianee", "Galanido", "Berina"));
        list.empList.get(list.empList.size() - 1).setEmpDateHired(new Date(23, 6, 2021));
        list.empList.get(list.empList.size() - 1).setEmpBirthDate(new Date(7, 7, 2001));
        ((CommissionEmployee)list.empList.get(list.empList.size() - 1)).setTotalSales(1000000.99);

        //BASE PLUS COMMISSION EMPLOYEE
        //less than 50k
        list.addEmployee(new BasePlusCommissionEmployee(9, new Name("Lily", "Morrow", "Jin"),
                new Date(22, 10, 2019), new Date(20, 12, 1993), 49000));
        ((BasePlusCommissionEmployee)list.empList.get(list.empList.size() - 1)).setBaseSalary(5000);

        //Display the added employees
        System.out.println("\nDISPLAY ALL EMPLOYEES:");
        list.displayEmployees();
        System.out.printf("CURRENT NUMBER OF EMPLOYEES -> %d\n", list.empList.size());

        list.displayHE();
        System.out.printf("\nHE Count -> %d\n", list.countHE());
        list.displayPWE();
        System.out.printf("\nPWE Count -> %d\n", list.countPWE());
        list.displayCE();
        System.out.printf("\nCE Count -> %d\n", list.countCE());
        list.displayBPCE();
        System.out.printf("\nBPCE Count -> %d\n", list.countBPCE());

        list.deleteEmployee(1); // ID 1: Marc B. Ochavo to be deleted
        System.out.println("EMPLOYEE LIST AFTER DELETION OF ID 1: \n");
        list.displayEmployees();
        System.out.printf("CURRENT NUMBER OF EMPLOYEES -> %d\n", list.empList.size()); // From 9 to 8
        System.out.printf("NEW COUNT OF HOURLY EMPLOYEE LIST -> %d\n\n", list.countHE());

        //Updates the employee based on the ID with the new details
        list.updateEmployee(2, "Joshua", "Namoc", "Ochavo", 20, 10);//HE ID - 2
        list.updateEmployee(3,"", "", "", 312 , 100);//PWE ID - 3
        list.updateEmployee(5, "Coycoy", "", "", 500000);//CE ID - 5
        list.updateEmployee(9, "", "", "", 250000, 800000);//BPCE ID - 9

        System.out.println("\nUPDATES OF EMPLOYEE LIST: ");
        list.displayEmployees();
        System.out.printf("CURRENT NUMBER OF EMPLOYEES -> %d\n", list.empList.size()); // From 9 to 8

        EmployeeRoster getEmpList = list.getEmployee("Galanido");
        System.out.println("\nALL EMPLOYEES WITH THE LAST NAME OF GALANIDO");
        getEmpList.displayEmployees();
        System.out.printf("CURRENT NUMBER OF EMPLOYEES -> %d\n", list.empList.size());
    }
}
