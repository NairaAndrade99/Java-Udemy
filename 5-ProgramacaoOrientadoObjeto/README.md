## Programação Orientado a Objeto 
### *_CLASSE_*

### Classe: É a definição do tipo

> É um tipo estruturado que pode conter (membros)
>> - Atributo (dados/campos)
>> - Métodos (funções/operações)

> A classe também pode prover muitos outros recursos, tais como:
>> - Contrutores
>> - Sobrecarga
>> - Encapsulamento
>> - Herança 
>> - Polimorfismo

### Sintaxe 
~~~~java 
public class Triangle {
    // Atributos da classe 
    public double a;
    public double b;
    public double c;
}
~~~~
--------
### *_Criando o objeto_*
### Objetos:  São instâncias da classe 

~~~~java 
Triangle x, y;
x = new Triangle ();
y = new Triangle ();
~~~~

### Atribuindo valor as váriaveis 
~~~~java 
x.a = sc.nextDouble ();
x.b = sc.nextDouble ();
x.c = sc.nextDouble ();

y.a = sc.nextDouble ();
y.b = sc.nextDoible ();
y.c = sc.nextDoible ();
~~~~
----
### *_Método_*
### Sintaxe 
~~~~java 
public double area (){
      
      double p = (a + b + c) / 2.0;
      return  Math.sqrt(p * (p - a) * (p - b) * (p - c));     
}
~~~~

### Chamando o método na main 
### Método: São as ações 

~~~java 
    double areaX = x.area();
    double areaY = y.area();
~~~
-----
>  Toda classe em java é uma subclasse da classe Object

>  Object possui os seguintes métodos
>> - getClass - retorna o tipo do objeto
>> - equals - compara se o objeto é igual a outro
>> - hashCode - retorna um código hash do objeto
>> - toString - converte o objeto para string   


### *_Object e toString_*

#### Exemplo 
##### Criando 
~~~~java
public class Product {

}
public Strint toString (){

    return 
}
~~~~
##### Chamando 
~~~~java
Product product = new Product ();

system.out.println(product);
~~~~

----
### *_Membros estáticos_*
> - Também chamados membros de classe
>> - Em oposiçao a membros e instância 
> - São membros que fazem sentido independentemente de objeto. Não precisam de objeto para serem chamados. São chamadas a partir do próprio nome da classe 
> - Aplicações comuns 
>> - Classes utilitária 
>> - Declaração de constantes 
> - Uma classe que possui somente membros estáticos, pode ser uma classe estática também. Esta classe não poderá ser instanciada 

### Exemplo 
##### Nome para constante tem que ser tudo com a letra maiúscula 
#### Não pode chamar um método que não é estátivo dentro da classe principal 
* Declaração da constante

*_Final_* quer dizer que valor não pode ser alterado 

~~~~java 
public static final double PI = 3.14159;
~~~~
#### Chamando o método no programa principal 
~~~~java 
double c = nome_do_metodo(variavel);
~~~~ 
#### Método estático  
~~~java 
public static double nome_do_metodo (tipo váriavel){
        return;
}
~~~~




