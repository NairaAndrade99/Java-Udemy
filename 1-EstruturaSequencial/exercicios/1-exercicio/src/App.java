import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
   
        int [] vect = new int [10]; 
        int soma = 0;
        
        System.out.println("Realizar a soma:  ");
   
        for (int i = 0; i < 2; i++) {
             vect[i] = sc.nextInt();
             soma += vect[i];
        }
        
   
        System.out.printf("SOMA = %d ", soma);
   
   
       }
   }