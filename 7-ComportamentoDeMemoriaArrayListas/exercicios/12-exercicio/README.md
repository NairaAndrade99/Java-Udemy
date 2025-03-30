## VETOR CLASSE 

~~~~java
Produto vetor [] = new Produto[10];

for (int i = 0;i < 10;i++){
    
      String nome = sc.nextLine();
      double preco = sc.nextDouble();
      
      vetor[i] = new Produto(nome,preco);
}
for(int i = 0; i < 10; i++){

     System.out.println(vetor[i].getNome());
     System.out.println(vetor[i].getPreco());

}
~~~~~
