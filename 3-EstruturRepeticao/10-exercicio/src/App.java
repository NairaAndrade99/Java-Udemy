import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

         int n = sc.nextInt();

        for (int i = 1; i < n +1; i++) {

            System.out.println( i + " " + i * i +"  " + i * i * i);
        }
    }
}
