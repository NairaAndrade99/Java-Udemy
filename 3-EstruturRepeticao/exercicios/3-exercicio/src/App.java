import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

         
         int qnt = 0, alco =  0, gaso = 0, die = 0;


         System.out.println("\n ABASTECIMENTO");
         System.out.println("--------------------");
         System.out.println("1 - Álcool ");
         System.out.println("2 - Gasolina ");
         System.out.println("3 - Diesel ");
         System.out.println("-----------------------");

         int combustivel = sc.nextInt();

         while (combustivel >= 1 && combustivel != 4) {
                
                if (combustivel == 1){
                       alco += 1;
                    }else if (combustivel == 2){
                        gaso += 1;
                    }else if (combustivel == 3) {
                         die += 1;
                    }

                     combustivel = sc.nextInt();
                 
         }
           
         System.out.println("Muito obrigada ");

          System.out.printf("\n Álcool: %d" , alco +
                             "\n Gasolina: %d" , gaso +
                             "\n Diesel: %d", die);
         
        System.out.println("\n ");
        
    }
}
