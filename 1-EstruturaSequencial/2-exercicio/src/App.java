import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe o raio do circulo: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(2, raio);

        System.out.printf("Area: %.2f ", area);


    }
}

