import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        int [] id = new int [2];
        int [] qunt = new int [2];
        double [] val = new double [2];

        double valor = 0.0;

        for (int i = 0; i < 2; i++){
            System.out.print("ID: ");
            id[i] = sc.nextInt();
            System.out.print("Quantidade: ");
            qunt[i] = sc.nextInt();
            System.out.print("Valor por unidade: ");
            val[i] = sc.nextDouble();
        }

        for (int i = 0; i < 2; i++){
             valor += qunt[i] * val[i];
        }

        System.out.printf("Valor a pagar R$%.2f%n ", valor);

        

    }
}
