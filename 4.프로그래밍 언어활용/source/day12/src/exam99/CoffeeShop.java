package exam99;

public interface CoffeeShop {
    CoffeeShop enter(Person person);
    CoffeeShop order();
    void exit();
    int getTotalSalePrice();
    String getName();

   static void showSaleSummary(CoffeeShop  shop){
                         // StarBucks,CoffeeBean 둘다 가능 : 다형성
        System.out.printf("%s의 총 매츨액은 %d 원 입니다.%n",shop.getName(),shop.getTotalSalePrice());
    }
}
