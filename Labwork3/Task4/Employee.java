package Labwork3.Task4;

public class Employee {
    private String ID;
    private String fullName;
    private String department;
    private double basicSalary;
    private double extraSalary;

    public Employee(String ID, String fullName, String department, double basicSalary, double extraSalary) {
        this.ID = ID;
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
