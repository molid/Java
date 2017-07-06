//public class Hello {
//    public static void main(String []args) {
//        System.out.println("Hello World");
//    }
//}

import java.io.*;
public class Hello{

    public static void main(String arg[]){
        Employee empone = new Employee("AAAAA1");
        Employee empTwo = new Employee("AAAAA2");

        empone.empAge(26);
        empone.emDesignation("程序团");
        empone.emSalary(10000);
        empone.printEmployee();

        empTwo.empAge(25);
        empTwo.emDesignation("程序团1");
        empTwo.emSalary(60000);
        empTwo.printEmployee();
    }

}