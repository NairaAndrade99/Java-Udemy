import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);
         
        
       System.out.print("Quantas pessoas serão digitadas: ");
       int num = sc.nextInt();

       double altura [] = new double [num];
       char genero [] = new char[num];

       double menorAltura = 0.0;
       //double maiorAltura = 0.00;

       for (int i = 0;i < num;i++){
          System.out.printf("Altura da %s pessoa: ",i+1);
          altura[i] = sc.nextDouble();
          System.out.printf("Genero da %s pessoa: ",i+1);
          genero[i] = sc.next().charAt(0);
       }
       for (int i = 0;i < num;i++){
           if (altura[i] < menorAltura){
                      menorAltura = altura[i];
           }
       }
       System.out.printf("MENOR ALTURA = %.2f ", menorAltura);

    }
}
