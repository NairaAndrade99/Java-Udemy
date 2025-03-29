import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Quantas pessoas voce vai digitar? ");
        int num = sc.nextInt();

        String nome [] = new String [num];
        int idade [] = new int [num];

        for (int i = 0;i < num;i ++){
            System.out.printf("Dados da %s pessoa ", i+1);
            System.out.print("\n Nome: ");
              nome[i] = sc.next();
            System.out.print ("Idade: ");
              idade[i] = sc.nextInt();
        }
        int maiorIdade = 0;
        String nomeMaior= "Idade: ";
        for (int i = 0;i < num; i++){
               if (idade[i] > maiorIdade){
                     maiorIdade = idade[i];
                     nomeMaior = nome[i];
               }
        }

        System.out.printf("\n PESSSOA MAIS VELHA: %s ",nomeMaior);


        
    }
}
