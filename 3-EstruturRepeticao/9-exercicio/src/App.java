import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        int num = sc.nextInt();
        System.out.println(" ");
        
        for (int i = 1; i < num + 1; i++) {

            if (num % i == 0){

                System.out.println(i);
            }
        }
    }
}
