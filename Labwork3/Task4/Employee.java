package Labwork3.Task4;

public class Employee {
    private String ID;
    private String fullName;
    private String department;
    private double basicSalary;
    private double extraSalary;
    private double income;

    public Employee(){

    }

    public Employee(String ID, String fullName, String department, double basicSalary, double extraSalary){
        this.ID = ID;
        this.fullName = fullName;
        this.department = department;
        this.basicSalary = basicSalary;
        this.extraSalary = extraSalary;
        this.income = getIncome();
    }

    public String getID(){
        return ID;
    }

    public String getFullName(){
        return fullName;
    }

    public String getDepartment(){
        return department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getExtraSalary() {
        return extraSalary;
    }

    public double getIncome(){
        return basicSalary + extraSalary * 2.5;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + ID + ", fullName=" + fullName + ", department=" + department + ", basicSalary="
                + basicSalary + ", extraSalary=" + extraSalary + ", income=" + income + "]";
    }

    public void setID(String iD) {
        ID = iD;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setExtraSalary(double extraSalary) {
        this.extraSalary = extraSalary;
    }
    
    
    
}
