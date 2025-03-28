import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int num = sc.nextInt();

         double vet [] = new double [num];

         for (int i = 0;i < num;i++){
              System.out.print("Digite um numero: ");
              vet[i] = sc.nextInt();
         }
         double maiorValor = 0.00;
         int posicao = 0;
         for (int i = 0; i < num;i++){
            for (int j = 0; j < num;j++){
                if (vet[i] > vet[j]){
                    maiorValor = vet[i];
                    posicao = i;
                }
            }
                
             }
             System.out.print("-------------");
             System.out.println("MAIOR VALOR = " + maiorValor);
             System.out.println("POSICAO DO MAIOR VALOR = " + posicao);

         }
    }

