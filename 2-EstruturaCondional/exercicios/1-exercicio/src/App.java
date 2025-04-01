import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);  
        
       System.out.println("NEGTIVO OU POSSITIVO");

       System.out.println("Informe o numero: ");
       int num =  sc.nextInt();

       if (num > 0 ){
        System.out.println(" Possitivo! ");
       }else {
        System.out.println(" Negtivo! ");
       }
    }
}
