import java.util.Date;

import entities.Order;
import enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {

        Order order = new Order(10, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

       
    }
}
