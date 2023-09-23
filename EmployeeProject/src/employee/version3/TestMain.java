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
public class TestMain {
    public static void main(String[] args) {
        //Hourly Employee
        HourlyEmployee emp1 = new HourlyEmployee();

        emp1.setEmpID(1);
        emp1.setEmpName(new Name("Marc", "Ochavo", "Berina"));
        emp1.setEmpDateHired(new Date(16, 4, 2022));
        emp1.setEmpBirthDate(new Date(3, 12, 2003));
        emp1.setTotalHourWorked(15);
        emp1.setRatePerHour(75);

        emp1.displayInfo();

        HourlyEmployee emp2 = new HourlyEmployee();

        emp2.setEmpID(2);
        emp2.setEmpName(new Name("Mr.", "Nelson", "Ochavo", "Miasco", "")); // With title
        emp2.setEmpDateHired(new Date(3, 12, 2003));
        emp2.setEmpBirthDate(new Date(8, 9, 1973));
        emp2.setTotalHourWorked(45);
        emp2.setRatePerHour(75);

        emp2.displayInfo();

        //Per Piece Worker
        PieceWorkerEmployee pemp1 = new PieceWorkerEmployee();

        pemp1.setEmpID(3);
        pemp1.setEmpName(new Name("" ,"Nicolas", "Ochavo", "Berina", "Jr."));//Without Title
        pemp1.setEmpDateHired(new Date(14, 9, 2022));
        pemp1.setEmpBirthDate(new Date(5, 3, 2002));
        pemp1.setTotalPiecesFinished(100);
        pemp1.setRatePerPiece(95);

        pemp1.displayInfo();

        PieceWorkerEmployee pemp2 = new PieceWorkerEmployee();

        pemp2.setEmpID(4);
        pemp2.setEmpName(new Name("Engr.", "Marcy", "Ochavo", "Berina", "Sr.")); // Both have title and suffix
        pemp2.setEmpDateHired(new Date(5, 3, 2002));
        pemp2.setEmpBirthDate(new Date(15, 12, 1972));
        pemp2.setTotalPiecesFinished(95);
        pemp2.setRatePerPiece(95);

        pemp2.displayInfo();

        //Commission Worker

        //less than 50k
        CommissionEmployee cemp1 = new CommissionEmployee();

        cemp1.setEmpID(5);
        cemp1.setEmpName(new Name("Marjhun", "Galanido", "Berina"));
        cemp1.setEmpDateHired(new Date(22, 10, 2019));
        cemp1.setEmpBirthDate(new Date(20, 12, 1993));
        cemp1.setTotalSales(49000);

        cemp1.displayInfo();

        //greater or equal to 50k but less than 100k
        CommissionEmployee cemp2 = new CommissionEmployee();

        cemp2.setEmpID(6);
        cemp2.setEmpName(new Name("Ella", "Galanido", "Adolfo"));
        cemp2.setEmpDateHired(new Date(1, 6, 2018));
        cemp2.setEmpBirthDate(new Date(26, 11, 1993));
        cemp2.setTotalSales(85000.50);

        cemp2.displayInfo();

        //greater or equal to 100k but less than 500k
        CommissionEmployee cemp3 = new CommissionEmployee();

        cemp3.setEmpID(7);
        cemp3.setEmpName(new Name("King", "Galanido", "Berina"));
        cemp3.setEmpDateHired(new Date(1, 6, 2023));
        cemp3.setEmpBirthDate(new Date(20, 10, 2021));
        cemp3.setTotalSales(499999.99);

        cemp3.displayInfo();

        //greater than 500k onwards
        CommissionEmployee cemp4 = new CommissionEmployee();

        cemp4.setEmpID(8);
        cemp4.setEmpName(new Name("Christianee", "Galanido", "Berina"));
        cemp4.setEmpDateHired(new Date(23, 6, 2021));
        cemp4.setEmpBirthDate(new Date(7, 7, 2001));
        cemp4.setTotalSales(1000000.99);

        cemp4.displayInfo();

                //Base Plus Commission Worker

        //less than 50k
        BasePlusCommissionEmployee bpcemp1 = new BasePlusCommissionEmployee();

        bpcemp1.setEmpID(9);
        bpcemp1.setEmpName(new Name("Lily", "Morrow", "Jin"));
        bpcemp1.setEmpDateHired(new Date(22, 10, 2019));
        bpcemp1.setEmpBirthDate(new Date(20, 12, 1993));
        bpcemp1.setTotalSales(49000);
        bpcemp1.setBaseSalary(5000);

        bpcemp1.displayInfo();
    }
}
