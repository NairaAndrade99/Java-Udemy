import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

        int num = sc.nextInt();
        int n1,n2;
        double soma;

        for (int i = 0; i < num; i++) {

              soma = 0.0;
              
            n1 = sc.nextInt();
            n2 = sc.nextInt();

        if (n2 == 0){
                System.out.println("Divisão impossivel");
        }else {

             soma = n1 / n2;
             System.out.print(" " + soma);

        }
           
        }
        
    }
}
