import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);
         
        
       System.out.print("Quantas pessoas serão digitadas: ");
       int num = sc.nextInt();

       double altura [] = new double [num];
       char genero [] = new char[num];

       double menorAltura = 0.0;
       double maiorAltura = 0.0;
       double mediaAltura = 0.0;
       int cont = 0;
       int contHomens = 0;

       for (int i = 0;i < num;i++){
          System.out.printf("Altura da %s pessoa: ",i+1);
          altura[i] = sc.nextDouble();
          System.out.printf("Genero da %s pessoa: ",i+1);
          genero[i] = sc.next().charAt(0);
       }
       for (int i = 0;i < num;i++){
           if (altura[i] < menorAltura){
                      menorAltura = altura[i];
           }

       }for (int i = 0;i < num;i++){
            if (altura[i] > maiorAltura){
                   maiorAltura = altura[i];
        }
    }
       for (int i = 0;i < num;i++){
           if (genero[i] == 'm'){
                cont ++;
              mediaAltura += altura[i]/cont;
           }else {
                contHomens ++;
           }
       }

       System.out.printf("MENOR ALTURA = %.2f ", menorAltura);
       System.out.printf("\n MAIOR ALTURA = %.2f ", maiorAltura);
       System.out.printf("\n MÉDIA DAS ALTURAS DAS MULHERES = %.2f ", mediaAltura);
       System.out.printf("\n MUMERO DE HOMENS = %d ", contHomens);
    }
}
