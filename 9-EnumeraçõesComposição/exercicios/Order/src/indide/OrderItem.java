package indide;

public class OrderItem {
   private Integer quantity;
   private double price;
  

private Product product;
  
public OrderItem (){

}
public OrderItem(Integer quantity, double price) {
    this.quantity = quantity;
    this.price = price;
}
public Integer getQuantity() {
    return quantity;
}
public void setQuantity(Integer quantity) {
    this.quantity = quantity;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
private double subTotal (){
      return price * quantity;
}
public Product getProduct() {
    return product;
}
public void setProduct(Product product) {
    this.product = product;
}


}
