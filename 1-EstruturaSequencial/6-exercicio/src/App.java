import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Informe os valores : ");
        
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

       float areaTriangulo = a * c / 2;
       float areaCirculo =  (float) Math.PI * (float) Math.pow(c, 2);
       float areaTrapezio = ((a + b ) * c )/2;
       float areaQuadrado = b * b;
       float areaRetangulo = a * b;

       System.out.printf("Area do Triangulo = %.2f " ,areaTriangulo);
       System.out.printf("Area do circulo = %.2f " , areaCirculo);
       System.out.printf("Area do trapezio = %.2f " , areaTrapezio);
       System.out.printf("Area do quadrado = %.2f " , areaQuadrado);
       System.out.printf("Area do retangulo = %.2f " , areaRetangulo);
       
        

         

    }
}
