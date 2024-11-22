import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o horario inicial: ");
        int horaInicial = sc.nextInt();

        System.out.print("Informe o horario final: ");
        int horaFinal = sc.nextInt();

        
        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;

        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        if (duracao < 1) {
            duracao = 24;
        }

        System.out.printf("A duração do jogo foi de %d horas." , duracao);


    }
}
