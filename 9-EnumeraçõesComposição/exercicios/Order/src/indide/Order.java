package indide;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Order {
        
      private Date moment;
      private OrderStatus status;

private List<OrderItem> listIntem =  new ArrayList<>();
private Client client;

public Order(){

}

public Order(Date moment, OrderStatus status,Client client) {
    this.moment = moment;
    this.status = status;
    this.client = client;
    
}

public Date getMoment() {
    return moment;
}

public void setMoment(Date moment) {
    this.moment = moment;
}

public OrderStatus getStatus() {
    return status;
}

public void setStatus(OrderStatus status) {
    this.status = status;
}
public void addItem(OrderItem item){
     listIntem.add(item);
}

public void removerItem(OrderItem item){
      listIntem.remove(item);
}
public double total (){
    return 0;
}

public List<OrderItem> getListIntem() {
    return listIntem;
}

public Client getClient() {
    return client;
}


}