/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

/**
 *
 * @author NewtskieTzy
 */
public class PieceWorkerEmployee {
    private int empID = 0;
    private String empName = "";
    private Date empDateHired = new Date(1, 1, 2023);
    private Date empBirthDate = new Date(1, 1, 2023);
    private int totalPiecesFinished = 0;
    private float ratePerPiece = 0;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished > 0 ? totalPiecesFinished : 0;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece > 0 ? ratePerPiece : 0;
    }
    
    public double computeSalary(){
        double salary;
        double bonus = 0;
        
        //Salary below 100 pieces finished
        salary = totalPiecesFinished * ratePerPiece; 
        
        //Salary with bonus for every 100 pieces finished
        if(totalPiecesFinished >= 100){
            bonus = (totalPiecesFinished / 100) * (ratePerPiece * 10);
            salary +=bonus;
        } 
        
        System.out.println("Added Bonus: " + bonus );
        return salary;
    }
    
    public void displayInfo(){
        System.out.println("Piece Per Worker Employee: \n");
        System.out.println(this);
        System.out.printf("Salary: %.2f%n", computeSalary());
    }

    @Override
    public String toString() {
        return  "ID: " + empID + "\nName: " + empName + 
                "\nDate Hired: " + empDateHired + "\nBirthdate: " + empBirthDate + 
                String.format("\nTotal pieces finished: %d", totalPiecesFinished) + 
                String.format("\nRate per piece: %.2f", ratePerPiece);
    }
    
    
}
