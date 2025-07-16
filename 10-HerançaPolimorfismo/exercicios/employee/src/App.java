import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

        List <Employee> employee = new ArrayList<>();

        System.out.println(" Enter the number of employees:");
        int num = sc.nextInt();
        char op ;

        for (int i = 0; i < num; i++){
            System.out.println("  Employee # %.d data:" + i + 1);
            System.out.println(" Outsourced(y/n)?");
              op = sc.next().charAt(0);

            System.out.println("Name: ");
            String nome = sc.next();
            System.out.println("Hours: ");
            int hours = sc.nextInt();
            System.out.println(" Valueper hour: ");
            double valuePerHour = sc.nextDouble();

            if(op ==  'y'){

              System.out.println(" Additionalcharge: ");
              double additionalcharge = sc.nextDouble();

              
              employee.add(new OutsourcedEmployee(nome,hours,valuePerHour,additionalcharge));

        }else {
            Employee emp = new Employee(nome,hours,valuePerHour);
              employee.add(emp);
        }
    }
         System.out.println("\n  PAYMENTS: ");
         for(Employee e : employee){
               System.out.println(e.getName()+ "- $  "+ e.payment());
         }
    }
}
