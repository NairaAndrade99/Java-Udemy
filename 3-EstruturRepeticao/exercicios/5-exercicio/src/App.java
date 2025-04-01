import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Informe o valor : ");
        int n = sc.nextInt();
        int qntIn = 0, qntOut = 0;

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();

            if (x >= 10 && x <= 20 ){
                  qntIn += 1;

            }else {
                 qntOut += 1;

            }
        }

        System.out.println("\n " + qntIn + "In \n " 
                        + qntOut + " Out \n" );

        
    }
}
