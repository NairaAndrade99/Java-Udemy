import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("Quantos elementos vai ter o vetor ? ");
        int num = sc.nextInt();

        int vetor [] = new int[num];

        for (int i = 0;i < num;i++){
             System.out.print("Digite um numero:  ");
             vetor[i] = sc.nextInt();
        }
        int contador = 0;
        int con = 0;
        for (int i = 0;i < num;i ++){
             if (vetor[i] % 2 == 0){
                  contador += vetor[i];
                  con ++;
             }
        }
        if (con == 0){
            System.out.print("NENHUM PAR ");
        }else {
        double media = contador / con; 

        System.out.printf("MEDIA DOS PARES = %.1f " , media);
        }
    }
}
