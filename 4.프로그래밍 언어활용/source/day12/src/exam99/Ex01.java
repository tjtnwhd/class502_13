package exam99;

public class Ex01 {
    public static void main(String[] args) {
        StarBucks starBucks = new StarBucks();
        CoffeeBean coffeeBean = new CoffeeBean();

        Person kim = new Person("김씨",10000);
        Person Lee = new Person("이씨",15000);

        kim.setMenu("아메리카노");
        Lee.setMenu("라떼");

        try {
            starBucks.enter(kim).order().exit();
            coffeeBean.enter(Lee).order().exit();
            System.out.println(kim);
            System.out.println(Lee);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("커피숍별 매출액 요약");
        CoffeeShop.showSaleSummary(starBucks);
        CoffeeShop.showSaleSummary(coffeeBean);

    }
}
