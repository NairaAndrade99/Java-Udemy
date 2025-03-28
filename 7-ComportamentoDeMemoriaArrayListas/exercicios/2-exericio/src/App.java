import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int num = sc.nextInt();

        double vetor [] = new double [num];

        for (int i = 0; i < vetor.length;i++){
              System.out.print("Digite um numero: ");
              double n = sc.nextInt();
              vetor[i] = n;
        }
        System.out.print("Valores = ");
        for (int i = 0;i < vetor.length;i++){
              System.out.print("  " + vetor[i] );
        }
        double soma = 0.0;
        System.out.print("\n Soma = ");
        for (int i = 0;i < vetor.length;i++){
               soma += vetor[i];    
        }
        System.out.print(soma);
        System.out.println("\n Media = " + soma / vetor.length);
        
    }
}
