import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int num = sc.nextInt ();

        String nome [] = new String [num];
        double primeiroSm [] = new double [num];
        double segundoSm[] = new double [num];


           

        for (int i = 0; i < num;i++){
            System.out.printf("Digite nome, primeiro e segunda nota %s aluno \n", i+1);
            sc.nextLine();
            nome[i] = sc.nextLine();
            primeiroSm[i] = sc.nextDouble();
            segundoSm[i] = sc.nextDouble();

        }
        System.out.println("ALUNOS APROVADOS ");
        
        double soma ;
        for (int i = 0; i < num;i++){
             soma = primeiroSm[i] + segundoSm[i] / 2;

            if (soma >= 6.0){
                 
                System.out.printf("%s \n",nome[i]);
                 
            }
        }
        
    }
}
