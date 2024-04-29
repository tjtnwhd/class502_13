package exam02;

public class Ex04 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());


        Jucier.make2(appleBox); // Apple, Fruit, Object (extends의 상한제한)

//        FruitBox<Grape> grapeBox = new FruitBox<>();
        FruitBox<Fruit> grapeBox = new FruitBox<>();
        grapeBox.add(new Grape()); // Fruit fruit = new Grape(); 다형성
        Jucier.make2(grapeBox);
    }

}
