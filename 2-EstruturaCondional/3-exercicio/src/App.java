import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe os valores: ");
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        if (numA % numB == 0 || numB % numA == 0){
            System.out.println("São multiplos !");
        }else {
            System.out.println("Não são multiplos !");
        }



        
    }
}
