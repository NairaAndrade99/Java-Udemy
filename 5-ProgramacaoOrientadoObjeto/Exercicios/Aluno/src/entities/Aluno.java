package entities;

public class Aluno {

    public String nome;
    public double nota1,nota2,nota3;
    

public double notaFinal (){
    
    return nota1 + nota2 + nota3;
}
public double resultado (){
       
      if (notaFinal() < 60.0){
          System.out.println("Failed");
          return 60.0 - notaFinal();
      }else {
         System.out.println("Pass");
         return 0.0;
         
      }
     
}


}
