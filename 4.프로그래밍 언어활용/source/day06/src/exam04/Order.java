package exam04;

public class Order implements Buyer, Seller{
    @Override  // 재정의할 메서드
    public void buy() {
        System.out.println("구매"); // Order 에 있는 buy
    }

    @Override
    public void sell() {
        System.out.println("판매"); // Order 에 있는 sell
    }

    public void order(){
//    Seller.super.order();  // 둘중에 어떤것을 호출할지 명확하게 알려줘야한다.
        System.out.println("Order에서 정의한 order");
    }
}
