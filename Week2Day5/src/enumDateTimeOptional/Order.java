package enumDateTimeOptional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Order {
    private int id;
    private Optional<Customer> customer;
    private LocalDate orderDate;
    private OrderStatus status;
    private Optional<List<OrderItem>> orderItems;
    public Order(int id, Customer customer, LocalDate orderDate, OrderStatus status, List<OrderItem> orderItems) {
        this.id = id;
        this.customer = Optional.ofNullable(customer);
        this.orderDate = orderDate;
        this.status = status;
        this.orderItems = Optional.ofNullable(orderItems);
    }


    public String getOrderStatus() {
        if (status.equals("PAID")) {
            return "주문 완료";
        } else if (status.equals("SHIPPED")) {
            return "배송 완료";
        } else if (status.equals("DELIVERED")) {
            return "배송 완료";
        } else {
            return "주문 처리 중";
        }
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Optional<List<OrderItem>> getOrderItems() {
        return orderItems;
    }

    public Optional<Customer> getCustomer() {return customer;}
}


