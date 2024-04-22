package exam04;

public class Ex01 {
    public static void main(String[] args) {
        // 메서드 제정의는 항상 객체가 되어야만 사용 가능하다.
        Order Order = new Order();
        Order.buy();
        Order.sell();
        Buyer Buyer = Order;   //다형성
        Seller Seller = Order; // 다형성
        Buyer.buy();
        Seller.sell();
    }
}
