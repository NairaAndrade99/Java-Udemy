import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);

       int vetor [] = new int [10];

       System.out.println("Quantos numeros voce vai digitar: ");
       int num = sc.nextInt();

       for (int i = 0;i < num;i ++){
              System.out.print("Digite um numero: ");
              int n = sc.nextInt();
              vetor[i] = n;
       }
         System.out.println("--------------");
         System.out.println("Números negativos: " );
       for (int i = 0;i < num;i++){
             if (vetor[i] < 0){
                System.out.print(vetor[i]);
             }
       }
    }
}

