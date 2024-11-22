
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);
       
       System.out.print("\n Informe a senha: ");
       int senha = sc.nextInt();

       int senhaValida = 2002;

     while ( senha != senhaValida ) {

               System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
               System.out.println("Senha invalido");
                senha = sc.nextInt(); 
     }
      System.out.println("\n--------------------------");
       System.out.println("Acesso permitido");
       
    }
}
