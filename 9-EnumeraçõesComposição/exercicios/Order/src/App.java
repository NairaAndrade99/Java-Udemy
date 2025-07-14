import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Order;
import indide.Client;
import indide.Product;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter client data");

        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.println("Birthdate (DD/MM/YYYY):");
        Date date = (Date) sdf.parse(sc.next());
       
      Client client = new Client (name,email,date);

      System.out.println("Enterorderdata:");
      System.out.print("Status:");
      String status = sc.next();

      Order order = new Order (status.valueOf(status));

      System.out.println("How many item sto this order? ");
      int qnt = sc.nextInt ();

      for (int i = 0; i < qnt; i ++){
         System.out.println("Enter # %.d item data:"+ i + 1);

          System.out.print("Product name: ");
          String name = sc.next();

          System.out.print("Product price: ");
          Double price= sc.nextDouble();

          System.out.print("Quantity: ");
          int qt = sc.nextInt();

          Product product = new Product (name);

      }  
    }
}
