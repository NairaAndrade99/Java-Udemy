import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int num = sc.nextInt();
    
        String vetNome [] = new String[num];
        int vetIdade [] = new int [num];
        double vetAltura [] = new double [num];

        for (int i = 0;i <num;i++){
              System.out.println("----------------");
              System.out.printf("Dados da %s pessoa \n ", i +1);

              System.out.print("Nome: ");
              String nome = sc.next();
              vetNome[i] = nome;
               

              System.out.print("Idade: ");
              int idade = sc.nextInt();
              vetIdade[i] = idade;

              System.out.print("Altura: ");
              double altura = sc.nextDouble();
              vetAltura[i] = altura;

        }
        double media = 0.00;
        for (int i = 0;i < num;i++){
              media += vetAltura[i];
        }
        System.out.println("----------------");

        System.out.printf("Altura média: %.2f%n ", media/num);

        System.out.println("Pessoas com menos de 16 anos: ");
        for (int i = 0;i < num;i++){
            if (vetIdade[i] < 16){
                System.out.println(vetNome[i]);
            }
        }
        

        
    }
}
