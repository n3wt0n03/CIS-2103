package employee.version4;

public class Employee {
    private int empID = 0;
    private Name empName = new Name();
    private Date empDateHired = new Date();
    private Date empBirthDate = new Date();

    public Employee() {

    }

     public Employee(int empID, Name empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
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

    @Override
    public String toString() {
        return "\nID: " + empID +
               "\nName:" + empName +
               "\nDateHired: " + empDateHired +
               "\nBirthDate: " + empBirthDate;
    }
}

