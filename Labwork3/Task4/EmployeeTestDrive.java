package Lab3;

import java.io.*;
import java.util.*;

public class EmployeeTestDrive {
    
    // public Employee enter(int i){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the information for employee " + i + ":");
    //     System.out.print("Enter a employee ID: ");
    //     String ID = sc.nextLine();
        
    //     System.out.print("Enter a full name: ");
    //     String fullName = sc.nextLine();

    //     System.out.print("Enter an department: ");
    //     String department = sc.nextLine();

    //     // double basicSalary = 0;
    //     System.out.print("Enter a basic salary: ");
    //     double basicSalary = sc.nextDouble();

    //     System.out.print("Enter a extra salary: ");
    //     double extraSalary = sc.nextDouble();

    //     Employee newEmployee = new Employee(ID, fullName, department, basicSalary, extraSalary);

    //     return newEmployee;
    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = sc.nextInt();
        // sc.nextLine();
        // System.out.println(numberOfEmployees);

        // ArrayList<Employee> arrEmployees = new ArrayList<>();
        // EmployeeTestDrive testDrive = new EmployeeTestDrive();
        // for(int i = 0; i < numberOfEmployees; i++){
        //     Employee newEmployee = testDrive.enter(i + 1);
        //     arrEmployees.add(newEmployee);
        // }

        Employee[] arrEmployees = new Employee[numberOfEmployees];
        for(int i = 0; i < numberOfEmployees; i++){
            arrEmployees[i] = new Employee();
        }

        for(int i = 0; i < numberOfEmployees; i++){
            sc.nextLine();
            System.out.println("Enter the information for employee " + i + ":");
            System.out.print("Enter a employee ID: ");
            String ID = sc.nextLine();
            arrEmployees[i].setID(ID);

            System.out.print("Enter a full name: ");
            String fullName = sc.nextLine();
            arrEmployees[i].setFullName(fullName);

            System.out.print("Enter an department: ");
            String department = sc.nextLine();
            arrEmployees[i].setDepartment(department);

            // double basicSalary = 0;
            System.out.print("Enter a basic salary: ");
            double basicSalary = sc.nextDouble();
            arrEmployees[i].setBasicSalary(basicSalary);

            System.out.print("Enter a extra salary: ");
            double extraSalary = sc.nextDouble();
            arrEmployees[i].setExtraSalary(extraSalary);
        }

        try{
            PrintWriter out = new PrintWriter(new FileWriter("employee.txt"));
            for(Employee e : arrEmployees){
                out.println(e.getID());
                out.println(e.getFullName());
                out.println(e.getDepartment());
                out.println(e.getBasicSalary());
                out.println(e.getExtraSalary());
                out.println(e.getIncome());
                out.println();
            }

            out.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        try{
            Scanner sc2 = new Scanner(new FileInputStream("employee.txt"));
            
            // ArrayList<> info = new ArrayList<>();

            for(Employee e : arrEmployees){
                while(sc2.hasNextLine()){
                    String ID = sc2.nextLine();
                    String fullName = sc2.nextLine();
                    String department = sc2.nextLine();
                    double basicSalary = Double.parseDouble(sc2.nextLine());
                    double extraSalary = Double.parseDouble(sc2.nextLine());
                    double income = Double.parseDouble(sc2.nextLine());

                    Employee tmp = new Employee(ID, fullName, department, basicSalary, extraSalary);
                    System.out.println(tmp);

                    if(sc2.hasNextLine()) sc2.nextLine();
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

        sc.close();
        // System.out.println("Employee detail: ");
        // for(Employee e : arrEmployees){
        //     System.out.println(e);
        // }
    }


}

