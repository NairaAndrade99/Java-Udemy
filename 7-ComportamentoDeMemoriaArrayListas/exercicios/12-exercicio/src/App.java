import java.util.Scanner;
import entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos elementos deseja inserir: ");
        int num = sc.nextInt();

        Produto vetor [] = new Produto[num];
        double maiorPreco = 0.0;
        String produto = " ";

        for (int i = 0; i < num;i++){
            sc.nextLine();
             String nome = sc.nextLine();
             double preco = sc.nextDouble();
             vetor [i] = new Produto (nome,preco);
        }
        for (int i = 0;i < num;i++){
            if (vetor[i].getPreco() > maiorPreco){
                
                produto = vetor[i].getNome();

             
            }
        } 
        System.out.println("    Compras ");
        System.out.println("-----------");
            System.out.println("PRODUTO                PRECO");
        for (int i = 0;i < num;i++){
            
            System.out.printf("\n  " +vetor[i].getNome()+  "              R$%.2f \n" , vetor[i].getPreco());
        }
         System.out.println("-----------");
        
           System.out.println("Produto mais caro  " + produto);

        
    }

}
