import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

         int [] vect = new int [4];
         int diferenca = 0;
         
         for (int i = 0; i < vect.length; i++){
               vect[i] = sc.nextInt();
         }
         
            diferenca = (vect [0] * vect [1]) - (vect [2] * vect [3]);
        
         System.out.printf("\n  Diferenca %d ", diferenca);
    }
}
