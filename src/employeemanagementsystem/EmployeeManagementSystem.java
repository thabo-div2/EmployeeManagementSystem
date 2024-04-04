/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeemanagementsystem;

import java.util.Date;

/**
 *
 * @author Thabo Setsubi st10445734@vcconnnect.edu.za ST10445734
 */

enum  EmployeeType 
{
    FULL_TIME, 
    PART_TIME,
    CONTRACT
}
    
interface Employee 
{
    public void work();
}

abstract class AbstractEmployee implements Employee
{
    public abstract void work();

    //attributes name, salary, and hire date
    String employeeName;
    int employeeSalary;
    int hireDate;
    double bonus;
    EmployeeType employeeType;

    //methods to calculating bonus and displaying employee information
    public int calculateBonus(int salary)
    {
       return employeeSalary / 10;
    }

    public void displayEmployeeInfo(String eName, int eSalary, EmployeeType eType) 
    {
        // 
        this.employeeName = eName;
        this.employeeSalary = eSalary;
        Date hDate = new Date();
        this.hireDate = hDate.getDate();
        this.bonus = calculateBonus(eSalary);
        
        switch(eType)
        {
            case FULL_TIME:
                System.out.println(this.employeeName + " is working full-time");
                System.out.println("Name: " + this.employeeName);
                System.out.println("Salary: " + this.employeeSalary);
                System.out.println("Hire Date: " + this.hireDate);
                System.out.println("Bonus: " + this.bonus);
                break;
            case PART_TIME:
                System.out.println(this.employeeName + " is working part-time");
                System.out.println("Name: " + this.employeeName);
                System.out.println("Salary: " + this.employeeSalary);
                System.out.println("Hire Date: " + this.hireDate);
                System.out.println("Bonus: " + this.bonus);
                break;
            case CONTRACT:
                System.out.println(this.employeeName + " is working on contract");
                System.out.println("Name: " + this.employeeName);
                System.out.println("Bonus: " + this.bonus);
                break;
            default:
                break;
        }
    }
}

//subclasses FullTimeEmployee, PartTimeEmployee, and ContractEmployee
class FullTimeEmployee extends AbstractEmployee 
{
    public void work() 
    {
    }
}

class PartTimeEmployee extends AbstractEmployee 
{
    public void work() 
    {
    }
}

class ContractEmployee extends AbstractEmployee
{
    public void work() 
    {
    }
}
public class EmployeeManagementSystem
{
    

    //------------------------------------------------------------------------//
    // This is the main method
    public static void main(String[] args)
    {
        
    }
    //-------------------------00ooo0oo End of file oo0ooo00------------------//
}
