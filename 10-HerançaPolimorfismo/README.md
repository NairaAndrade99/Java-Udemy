## HERANÇA 
* É um tipo de associação que permite que uma classe herde _todos_ dados e comportamentos de outra 

### Sintaxe 
~~java 
class A extends B 
~~~~

~~~~java 
public Construtor (){
    super ([metodos da super classe])
};
~~~~

### Upcasting e downcasting 

### >- Upcasting 
 >-- Casting da subclasse para superclasse 
 >-- Uso comm : Polimorrfismo 

 ### >- Downcasting 
 >>  Casting da superclasse para subclase
 >> Palavra instanceof 
 >> Uso comum: métodos que recebem parametros genéricos (Ex: equals)

### Sobreposição, palavra super, anotação @Override
* É a implementação de um método de uma superclasse na subclasse 
* É fortemente recomendável usar a notação @Override em um método siobrescrrito
>> Facilita a leitura e comreensão do código 
>> Avisamos ao compilador (boa prática)

### Sintaxe 
~~~java 
public  SuperClasse (){
     
     public tipo metodo (){

     }
}
@Override
public SubClasse (){
    public tipo metodo (){

    }
}
~~~

### Palvra SUPER 

#### É possível chamar a implementação da superclasse usando a palavra *super*

~~~~java 
@Override 
public tipo metodo(){
    super.metodoSuperClasse();
}
~~~~

### Classe e método final 
* Palavra chave : final 
* Classe: evite que a classe seja herdada 

~~~~java 
public final class nomeClasse {

}
~~~~
* Método: evita que o método sob seja sobreposto 

### Polimorfismo
#### Em programação Orientada a Objetos, polimorfismo é recurso que permite que variáveis de um mesmo tipo mais genérico possam apontar para objeto de tipos especificos diferrentes, tendo assim comportamnetos diferentes conforme cada tipo especifico.

#### Importante entender 

#### * Associação do tipo especifico com o tipo genérico é feito eem tempo de execução (upcasting)
#### * O compilador nçao sabe para qual tipo especifico a chamada do método Withdraw está sendo feita (ele só sabe que são duas varriáveis tipo ACCOUNT )

~~~~java 
Account x = new Accoun ();
Account y = new SavingsAcoount ();

x.withdraw();
y.withdraw();
~~~~
