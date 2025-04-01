import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

       int linha = sc.nextInt ();
       int  coluna = sc.nextInt ();

       int matriz [][] = new int [linha][coluna];
       System.out.println("--------------------------------");

       for (int i = 0;i < linha;i++){
         for (int j = 0;j < coluna;j++){
            
              matriz[i][j] = sc.nextInt(); 
               
         }  
         
       }
       System.out.println("--------------------------------");
       
      for (int i = 0;i < linha;i++){
        for (int j = 0;j < coluna;j++){
            
             System.out.print("[ "+ matriz[i][j]+ "]");
        }
        System.out.println();
            
      }
      System.out.println("--------------------------------");

      int buscar = sc.nextInt();
      for (int i = 0;i < linha;i++){
        for (int j = 0;j < coluna;j++){
             if (matriz[i][j] == buscar ){

                System.out.printf("Position: %d,%d\n ",i,j);
                if (j > 0) {
                    System.out.println("Left: " + matriz[i][j-1]);
                }
                if (i > 0) {
                    System.out.println("Up: " + matriz[i-1][j]);
                }
                if (j < matriz[i].length-1) {
                    System.out.println("Right: " + matriz[i][j+1]);
                }
                if (i < matriz.length-1) {
                    System.out.println("Down: " + matriz[i+1][j]);
               
                 
             }
        }
        
                
     }
            System.out.println();
       }
    }
}