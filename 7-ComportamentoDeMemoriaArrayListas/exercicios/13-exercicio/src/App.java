import java.util.Scanner;
import entities.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.print("How many rooms will be rented ?");
        int num = sc.nextInt();

        Hotel dados [] = new Hotel [10];
        int room;

        for (int i = 0;i < num;i++){
              System.out.printf("Rent #%d ", i + 1);
              sc.nextLine();
              System.out.print("\n Nome: ");
              String nome = sc.nextLine();

              System.out.print("E-mail: ");
              String email= sc.nextLine();

              System.out.print("Room: ");
              int rms = sc.nextInt();

              dados[rms] = new Hotel(nome,email);     

        }
        System.out.print("Busy rooms: ");
        for(int i = 0;i < dados.length;i++){
            if (dados[i] != null)
              System.out.printf("\n %d: %s , %s \n", i ,dados[i].getNome(),dados[i].getEmail());
        }
        
    }
}
