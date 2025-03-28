import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Quantos elementos vai ter o vetor? ");
        int num = sc.nextInt();

        double vet [] = new double [num];

        for (int i = 0; i < num;i++){
            System.out.println("Digite um numero:  ");
            vet[i] = sc.nextDouble();
        }
        double media = 0.00;
        for (int i = 0; i < num;i++){
           media += vet[i];

        }
        double soma = media / num;
        System.out.println("MEDIA DO VETOR:  " + soma);
        System.out.println("-----------");

        for (int i = 0; i < num;i++){
             if ( vet[i]< soma){
                System.out.println(vet[i]);
             }

       }

    }
}
