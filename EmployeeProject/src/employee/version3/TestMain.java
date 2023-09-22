/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;


import employee.verison2.BasePlusCommissionEmployee;
import employee.verison2.Date;
import employee.verison2.HourlyEmployee;
import employee.verison2.PieceWorkerEmployee;
import employee.version1.CommissionEmployee;

/**
 *
 * @author NewtskieTzy
 */
public class TestMain {
    public static void main(String[] args) {
        //Hourly Employee
        employee.verison2.HourlyEmployee emp1 = new employee.verison2.HourlyEmployee(1, "Newton", new employee.verison2.Date(16, 4, 2022),
                new employee.verison2.Date(3, 12, 2003), 15, 75);

        emp1.displayInfo();

        employee.verison2.HourlyEmployee emp2 = new HourlyEmployee(2, "Nelson", new employee.verison2.Date(3, 12, 2003),
                new employee.verison2.Date(8, 9, 1973), 45, 75);

        emp2.displayInfo();

        //Per Piece Worker
        employee.verison2.PieceWorkerEmployee pemp1 = new employee.verison2.PieceWorkerEmployee(3, "Nicole", new employee.verison2.Date(14, 9, 2022)
        , new employee.verison2.Date(5, 3, 2002), 100, 95);

        pemp1.displayInfo();

        employee.verison2.PieceWorkerEmployee pemp2 = new PieceWorkerEmployee(4, "Ecal", new employee.verison2.Date(5, 3, 2002)
        , new employee.verison2.Date(15, 12, 1972), 95, 95);

        pemp2.displayInfo();

        //Commission Worker

        //less than 50k
        CommissionEmployee cemp1 = new CommissionEmployee(5, "Marjhun", new employee.version1.Date(22, 10, 2019)
                , new employee.version1.Date(20, 12, 1993), 49000);

        cemp1.displayInfo();

        //greater or equal to 50k but less than 100k
        CommissionEmployee cemp2 = new CommissionEmployee(6, "Ella", new employee.version1.Date(1, 6, 2018)
                , new employee.version1.Date(26, 11, 1993), 85000.50);

        cemp2.displayInfo();

        //greater or equal to 100k but less than 500k
        CommissionEmployee cemp3 = new CommissionEmployee(7, "King", new employee.version1.Date(1, 6, 2023)
                , new employee.version1.Date(20, 10, 2021), 499999.99);

        cemp3.displayInfo();

        //greater than 500k onwards
        CommissionEmployee cemp4 = new CommissionEmployee(8, "BBK", new employee.version1.Date(23, 6, 2021)
                , new employee.version1.Date(7, 7, 2001), 1000000.99);

        cemp4.displayInfo();

                //Base Plus Commission Worker

        //less than 50k
        employee.verison2.BasePlusCommissionEmployee bpcemp1 = new BasePlusCommissionEmployee(9, "Marjhun", new employee.verison2.Date(22, 10, 2019)
        , new Date(20, 12, 1993), 49000, 5000);

        bpcemp1.displayInfo();
    }
}
