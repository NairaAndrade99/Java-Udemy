import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);

      List <Product> list = new ArrayList<>();

      System.out.print(" Enter the number of products: ");
      int num = sc.nextInt();

      for (int i = 0; i < num; i++) {
          
          System.out.println("Product # %d data: " + i + 1);
          System.out.println("Common, usedorimported(c/u/i)? i");

          System.out.println("Name: ");
          String name = sc.next();
          System.out.println("Price: ");
          double price = sc.nextDouble();
          
          char op = sc.next().charAt(0);

          if (op == 'i'){
             System.out.println(" Customs fee:");
             double customsFee = sc.nextDouble();

             list.add(new ImportedProduct(name,price,customsFee));
          }else if(op  == 'u'){
              
           
              System.out.println(" Manufacturedate (DD/MM/YYYY):");
               LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                
              list.add(new UsedProduct(name,price, date));
          }else{
               list.add(new Product(name,price));
          }

      }

       
     System.out.println("PRICE TAGS:");

     for (Product p : list){
           System.out.println(p.priceTag());
        
     }


      
    }
}
