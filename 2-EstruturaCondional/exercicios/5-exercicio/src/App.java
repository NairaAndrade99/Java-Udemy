
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Informe o codigo: ");
        int id = sc.nextInt();

        System.out.println("Informe a qunatidade: ");
        int qnt = sc.nextInt();

        double preco;
        String especificacao;
        double pagar;

        switch (id) {
            case 1:
                preco = 4.00;
                especificacao = "Cachorro Quente";
                pagar = preco * qnt;
                System.out.printf("R$ %.2f" , preco);
                break;
            case 2:
                preco = 4.50;
                especificacao = "X-Salada";
                pagar = preco * qnt;
                System.out.printf("R$ %.2f" , preco);
                break;
            case 3:
                preco = 5.00;
                especificacao = "X-Bacon";
                pagar = preco * qnt;
                System.out.printf("R$ %.2f" , preco);
                break;
            case 4:
                preco = 2.00;
                especificacao = "Torrada simples";
                pagar = preco * qnt;
                System.out.printf("R$ %.2f" , preco);
                break;
            case 5:
                preco = 1.50;
                especificacao = "Refrigerante";
                pagar = preco * qnt;
                System.out.printf("R$ %.2f" , preco);
                break;
            default:
             System.out.println("Não tem !");
                break;
        }
        
    }
}
