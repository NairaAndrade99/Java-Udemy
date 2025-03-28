import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int num = sc.nextInt();

        int vet [] = new int [num];

        for (int i = 0;i < num;i++){
             System.out.print("Digite um numero: ");
             vet[i] = sc.nextInt();
        }
        System.out.println(" \n NUMEROS PARES ");
        int qnt = 0;
        for (int i = 0;i < num;i++){
              if (vet[i] % 2 == 0){
                   System.out.print("  " + vet[i]);
                   qnt ++;
              }
        }
        System.out.println(" \n Quantidade de pares = " + qnt);
        
    }
}
