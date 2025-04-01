import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int matriz [][] = new int[n][n];

        for(int i = 0;i < matriz.length;i++){
            for (int j = 0;j < matriz.length;j++){
                     matriz [i][j] = sc.nextInt();
            }
        }
          for (int i = 0;i < matriz.length;i++){
              for (int j = 0;j < matriz.length;j++){
              System.out.print(" [" + matriz[i][j] + " ]");

          }
          System.out.println();
       }
       System.out.print("Main diagonal:");
       for (int i = 0;i < matriz.length;i++){
         for(int j = 0;j < matriz.length;j++){
                 if (matriz[i] == matriz[j]){
                      System.out.print(" " + matriz[i][j]);
                 }
         }
       }
       int cont = 0;
       for (int i = 0;i < matriz.length;i++){
         for(int j = 0;j < matriz.length;j++){
            if (matriz[i][j] < 0){
                  cont ++;
            }
        }
    }
        System.out.println("\n Negative number:" + cont);  
   
 }
}