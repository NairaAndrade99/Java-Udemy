package entities;

import java.sql.Date;

import enums.OrderStatus;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus statu;

public Order(Integer id, Date moment, OrderStatus statu) {
        this.id = id;
        this.moment = moment;
        this.statu = statu;
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public Date getMoment() {
    return moment;
}

public void setMoment(Date moment) {
    this.moment = moment;
}

public OrderStatus getStatu() {
    return statu;
}

public void setStatu(OrderStatus statu) {
    this.statu = statu;
}

@Override
public String toString() {
    return "Order [id=" + id + ", moment=" + moment + ", statu=" + statu + "]";
}


}
