import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner (System.in);

      List <TaxPayer> list = new ArrrayList<>();

      System.out.print("Enter the number of tax payers:");
      int num = sc.nextInt();

      char op;

      for (int i = 0; i < num;i++){
        System.out.printf("Taxpayer # %d data:\n", i + 1);
        System.out.print(" Individual orcompany(i/c)?");
        op = sc.next().charAt(0);
        
        System.out.print("Name: ");
        String name = sc.next();

        System.out.print(" Anual income: ");
        double anualIncome = sc.nextDouble();

        if (op == 'i'){

        System.out.print(" Health expenditures: ");
        double healthExpenditures = sc.nextDouble();
        list.add(new Individual(name,anualIncome,healthExpenditures));

        }else {
        System.out.print("Numberofemployees: ");
        int numberOfEmployee = sc.nextInt();
        list.add(new Company (name,anualIncome,numberOfEmployee));
        }

      }
         
       System.out.println("Taxed paid");
       
       for(TaxPayer t: list){
         System.out.printf(t.getName()+ ": $ %2.f ", t.tax());
       }
        
       double sum = 0.0;
       for(TaxPayer t: list){
         
           sum += t.tax();

       }
       System.out.printf("Total taxes: $ ", sum );

    }
}
