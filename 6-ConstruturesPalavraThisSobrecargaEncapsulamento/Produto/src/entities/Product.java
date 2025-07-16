package entities;
public class Product {
    private String name;
    private double price;
    private int quantity;

//Construtor padrão 
public Product (){

}

// Construtor
public Product(String name,double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
}
// Sobrecarga 
public Product(String name;double price){
        this.name = name;
        this.price = price;

}
//Encapsulamento 
public String getName(){
     return name;
}
public void setName(String name){
    this.name = name;
}
public double getPrice (){
    return price;
}
public void setPrice (double price){
     this.price = price;
}
public int getQuantity (){
    return quantity;
}

public double TotalValueInStock(){
     return price * quantity;
}
public  void addProduct(int quantity){
    quantity += quantity;
}
public void removeProduct(int quantity){
    quantity -= quantity;
}
public String toString(){
    return name + 
            ", $ "+
            String.format("%.2f", price) +
            ", " + quantity +
            " units, Total: $ " +
            String.format("%.2f", TotalValueInStock()); 
}

}
