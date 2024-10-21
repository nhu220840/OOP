package Labwork3.Task4;

public class Employee {
    private String ID, fullName, department;
    private double basicSalary, extraSalary;

    public Employee(String iD, String fullName, String department, double basicSalary, double extraSalary) {
        ID = iD;
        this.fullName = fullName;
        this.department = department;
        this.basicSalary = basicSalary;
        this.extraSalary = extraSalary;
    }

    public String getID() {
        return ID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getExtraSalary() {
        return extraSalary;
    }

    
}
