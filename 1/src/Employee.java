import java.io.*;

public class Employee{
    String name;
    int age;
    String designation;
    double salary;
    public Employee(String name){
        this.name = name;
    }
    public void empAge(int emAge){
        age = emAge;
    }

    public void emDesignation(String emDesig){
        designation = emDesig;
    }
    public void emSalary(double emSalar){
        salary = emSalar;
    }

    public void printEmployee(){
        System.out.println("名字："+name);
        System.out.println("年龄："+age);
        System.out.println("职位："+designation);
        System.out.println("薪水："+salary);
    }
}