import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.department.Department;
import entities.hourContract.HourContract;
import entities.worker.Worker;
import entities.enuns.WorkerLevel;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
         
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       
       
        System.out.print("Enter department's name:");
        String depart  = sc.nextLine();

        System.out.println("Enter worker data:");
        
        
        System.out.println("Name:");
        String name = sc.nextLine();

        System.out.println("Level: ");
        String level  = sc.nextLine();

        System.out.println("Base salary:");
        Double salary = sc.nextDouble();
        
      
        Worker wo = new Worker (name,level.valueOf(level), salary, new  Department  (depart ));


        System.out.println("How many contracts to this worker?");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
              System.out.println("Enter contract #" + i + 1 + "data: ");
               System.out.println("Date (DD/MM/YYYY):");
               Date data = (Date) sdf.parse(sc.next());
               
               System.out.println("Value per hour: ");
               double hourVal = sc.nextDouble();

               System.out.println("Duration (hours):");
               int hour = sc.nextInt();

            HourContract hc = new HourContract(data,hourVal,hour);
            wo.addContract(hc);
        }

         System.out.println("Enter month and year to calculate income (MM/YYYY)");
         String monthAndYear = sc.next();

         int month = Integer.parseInt(monthAndYear.substring(0,2));
         int year = Integer.parseInt(monthAndYear.substring(3));
         

         System.out.println("Name: " + wo.getName());
         System.out.println("Department: " + wo.getDepartment().getName());
         System.out.println("Income for: " + monthAndYear + ": " + String.format("%2.f", wo.income(year,month)));


        




    }
}
