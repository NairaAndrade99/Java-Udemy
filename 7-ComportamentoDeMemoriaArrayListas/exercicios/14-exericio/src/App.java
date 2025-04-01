import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class App  {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        List <Funcionario> lista = new ArrayList<>();
        Funcionario funcionario = new Funcionario();


        System.out.println();
        System.out.print("How many employees vill be registered? ");
        int n = sc.nextInt();
 
        for(int i = 0;i < n;i++){

            System.out.print("\n");

            System.out.printf("Employee #%d: \n", i +1);
            System.out.print("Id: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            
            Funcionario fun = new Funcionario(id,name,salary);
            lista.add(fun);
        }
        
            System.out.print("Enter the employee id that will have salary increase: ");
            int idFun = sc.nextInt();


            Funcionario fun = lista.stream().filter(x -> x.getId() == idFun).findFirst().orElse(null);
         
        if (fun == null){
            System.out.println("Id não existe ! ");
        }else {
            System.out.print("Enter the percentage:");
            Double por = sc.nextDouble();
            fun.increaseSlary(por);
        }
            System.out.println();
         
         for (Funcionario fu: lista){
            System.out.println(fu);
         }
         
        
    }
}
