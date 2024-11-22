import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe os dados dos funcionarios: ");
        
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("Horas trabalhadas: ");
        int horaTrabalhados = sc.nextInt();
        System.out.print("Valor por hora: ");
        double valHora = sc.nextDouble();

        double salary = horaTrabalhados * valHora;

        System.out.printf("Number = %d%n", id);
        System.out.printf("Salary = u$%.2f%n ", salary);
    }
}
