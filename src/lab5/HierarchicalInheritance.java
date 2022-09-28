package lab5;
//Write a java program to demonstrate hierarchical inheritance

public class HierarchicalInheritance {
    public static void main(String args[]) {
        Employee employees[] = {new Intern(),new FullTime()};
        System.out.println("Printing Intern's info and then full time employee's:");
        for(Employee employee: employees){
            employee.printSalary();
            employee.incrementSalary();
            System.out.println("After incrementing: "+employee.salary);
            System.out.println("---------------");
        } 
    }
}

abstract class Employee {
    abstract void incrementSalary();
    void printSalary(){
        System.out.println("Salary of the employee is Rs."+salary);
    }
    double salary = 50000.0;
}

class Intern extends Employee {
    @Override
    void incrementSalary() {
        salary = salary + (salary*hike);
    }
    double hike = 0.15;
}

class FullTime extends Employee {
    @Override
    void incrementSalary() {
        salary = salary + (salary*hike);
    }
    double hike = 0.25;
}
