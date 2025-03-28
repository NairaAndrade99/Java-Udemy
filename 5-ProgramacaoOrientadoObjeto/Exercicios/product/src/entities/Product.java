package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

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
