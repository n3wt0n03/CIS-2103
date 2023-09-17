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
      

    }
    
}
