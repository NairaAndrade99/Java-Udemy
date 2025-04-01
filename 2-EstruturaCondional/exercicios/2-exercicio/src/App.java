import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);  
        
       System.out.println("PAR OU IMPAR");

       System.out.println("Informe o numero: ");
       int num =  sc.nextInt();

       if (num % 2 == 0 ){
        System.out.println(" Par! ");
       }else {
        System.out.println(" Impar! ");
       }
    }
}
