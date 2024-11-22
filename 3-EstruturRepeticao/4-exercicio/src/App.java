import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner (System.in);
       
        System.out.println("\n");

        int x = sc.nextInt();

        System.out.println("\n");
        
        for (int i = 1; i <  x; i++) {
            
            if (i % 2 != 0){
                 System.out.println(i);
            }

        }
        
        System.out.println("\n");


        
    }
}
