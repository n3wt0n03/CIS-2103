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
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Hourly Employee
        HourlyEmployee emp1 = new HourlyEmployee(1, "Newton", new Date(16, 4, 2022),
        new Date(3, 12, 2003), 15, 75);
        
        emp1.displayInfo();
        
        HourlyEmployee emp2 = new HourlyEmployee(2, "Nelson", new Date(3, 12, 2003),
        new Date(8, 9, 1973), 45, 75);
        
        emp2.displayInfo();
        
        //Per Piece Worker
        PieceWorkerEmployee pemp1 = new PieceWorkerEmployee(3, "Nicole", new Date(14, 9, 2022)
        , new Date(5, 3, 2002), 100, 95);
        
        pemp1.displayInfo();
        
        PieceWorkerEmployee pemp2 = new PieceWorkerEmployee(4, "Ecal", new Date(5, 3, 2002)
        , new Date(15, 12, 1972), 95, 95);
        
        pemp2.displayInfo();
      
        //Commission Worker
        
        //less than 50k
        CommissionEmployee cemp1 = new CommissionEmployee(5, "Marjhun", new Date(22, 10, 2019)
        , new Date(20, 12, 1993), 49000);
        
        cemp1.displayInfo();
        
        //greater or equal to 50k but less than 100k
        CommissionEmployee cemp2 = new CommissionEmployee(6, "Ella", new Date(1, 6, 2018)
        , new Date(26, 11, 1993), 85000.50);
        
        cemp2.displayInfo();
        
        //greater or equal to 100k but less than 500k
        CommissionEmployee cemp3 = new CommissionEmployee(7, "King", new Date(1, 6, 2023)
        , new Date(20, 10, 2021), 499999.99);
        
        cemp3.displayInfo();
        
        //greater than 500k onwards
        CommissionEmployee cemp4 = new CommissionEmployee(8, "BBK", new Date(23, 6, 2021)
        , new Date(7, 7, 2001), 1000000.99);
        
        cemp4.displayInfo();

    }
    
}
