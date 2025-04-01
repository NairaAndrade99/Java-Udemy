import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        int [] p = {2,3,5};

     
        float soma, val, num,valFinal;

        for (int i = 0; i < n; i++) {
                val = 0;

            for (int j = 0; j < 3; j++){
                  
                System.out.print("  ");
                 num = sc.nextFloat();

                 soma = num * p[j];
                 val += soma;
                

            }
                valFinal = val / 10;  
             System.out.print(valFinal);
        }
       
    }
}
