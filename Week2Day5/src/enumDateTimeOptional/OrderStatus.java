package enumDateTimeOptional;

public enum OrderStatus {
    PAID("주문 완료"),
    SHIPPED("배송 완료"),
    DELIVERED("배송 완료"),
    ON_ORDER("주문 중"),
    NOT_PAID("결제 하기 전");

    private String orderStatus;

    OrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

}
