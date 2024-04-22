package exam04;

public class Ex02 {
    public static void main(String[] args) {
        Order order = new Order();
        order.order(); // Buyer에 order 메서드 (완전히 구현된 (default) 메서드)
        // Order super로 명확히 알려줬다.

        Seller.staticMethod(); //정적 메서드
    }
}
