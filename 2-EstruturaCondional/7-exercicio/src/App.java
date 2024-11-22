import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o valor de X: ");
        float x = sc.nextFloat();

        System.out.print("Informe o valor de Y: ");
        float y = sc.nextFloat();

        if (x < 0 && y > 0){
            System.out.println(" Q2 ");
        }else if (x < 0 && y < 0){
            System.out.println(" Q3 ");
        }else if (x > 0 && y < 0){
            System.out.println(" Q4 ");
        }else if ( x > 0 && y > 0){
            System.out.println(" Q1");

        } else if ( x == 0 && y == 0){
             System.out.println(" origem");
        }else {
             System.out.println(" Não tem ");
        }




    }
}
