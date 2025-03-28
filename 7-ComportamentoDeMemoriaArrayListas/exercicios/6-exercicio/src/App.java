import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
         
         System.out.println("Quantos valores vai ter cada vetor ? ");
         int num = sc.nextInt();

         int a [] = new int [num];
         int b [] = new int [num];
         int c [] = new int [num];
         
         System.out.println("Digite os valores do vetor A: ");
         for (int i = 0; i < num;i++){
             a[i] = sc.nextInt();
         }

         System.out.println("Digite os valores do vetor B: ");
         for (int i = 0; i < num;i++){
            b[i] = sc.nextInt();
             
         }
         System.out.println("VETOR RESULTANTE: ");
         for (int i = 0; i < num;i++){
            System.out.println(c[i] = a[i] + b[i]);
             
         }

        
    }
}
