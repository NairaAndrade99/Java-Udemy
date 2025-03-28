import java.util.Scanner;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        Aluno aluno = new Aluno ();
        
        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();
        
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

         System.out.printf("Final grade %.2f%n", aluno.notaFinal());

        
         if (aluno.notaFinal() < 60.0){
            System.out.println("Failed");
            System.out.printf("Missing %.2f points ", aluno.resultado());
        }else {
           System.out.println("Pass");
        
           
        }



    }
}
