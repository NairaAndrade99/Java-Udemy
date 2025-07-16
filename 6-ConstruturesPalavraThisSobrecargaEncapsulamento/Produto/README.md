### Proposta de melhoria 
## Quando executamos o comando abaixo, instanciamos um produto *_"product"_* com seus atributos "vazios":

~~~~java 
product = new Product ();
~~~~
#### Memória 
-> Product 
name| price | quantity
:----|:-----|:------|
null |0.00|0

## Exemplo 
~~~~java 
public class Product{

    public String name;
    public double price;
    public int quantity;

    public Product(String name;double price;int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
~~~~
## Main 
~~~~java 
Product product = new Product (name,price,quantity);
~~~~
### Proposta de melhorias 
## Vamos criar um construtor opcional, o qual recebe apenas nome e preço do produto. A quantidade em estoque deste novo produto, por padrão deverá então ser iniciada com o valor zero 

~~~~java 
public Product (String name,double price){
    this.name = name;
    this.price = price;
}
~~~~
## Ainda podemos ter o construtor padrão 
~~~~java 
public Product(){

}
~~~~
## Esconder os detalhes da minha classe 
~~~~java 
private String name;
private double price;

public String getName(){
    return name;
}
public void setName(String name){
     this.name = name;
}
public double getPrice(){
    return price;
}
public void setPrice(double price){
      this.price = price;
}
~~~~

