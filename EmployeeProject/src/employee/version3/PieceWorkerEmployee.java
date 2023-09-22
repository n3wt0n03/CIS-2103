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
public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished = 0;
    private float ratePerPiece = 0;

    public PieceWorkerEmployee(int totalPiecesFinished, float ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    double computeSalary(){
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
        System.out.println("\nPiece Per Worker Employee: \n");
        System.out.println(toString());
        System.out.printf("Salary: %.2f%n", computeSalary());
    }

    @Override
    public String toString() {
        return  super.toString() +
                String.format("\nTotal pieces finished: %d", totalPiecesFinished) +
                String.format("\nRate per piece: %.2f", ratePerPiece);
    }
}
