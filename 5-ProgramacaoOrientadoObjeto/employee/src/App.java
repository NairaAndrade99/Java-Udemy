import java.util.Scanner;

import entities.Employees;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
        Employees em = new Employees();
        
        System.out.println("Name: ");
        em.name = sc.nextLine();

        System.out.println("Gross salary: ");
        em.grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        em.tax = sc.nextDouble();

        System.out.println(em);

        System.out.println("Which percentage to increase salary ? ");
        double per = sc.nextDouble();
        em.increseSalary(per);

        System.out.println("Updated data: " + em);
    }
}
