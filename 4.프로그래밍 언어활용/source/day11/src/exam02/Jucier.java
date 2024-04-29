package exam02;

import java.util.ArrayList;

public class Jucier { // 와일드카드 <?> : Object의 하위클래스를 의미

        // ? - Fruit포함, Apple, Grape 만 가능 (extends - 하한제한)
    public static void make(FruitBox<? extends Fruit> box){ //
         // 컴파일시 <Apple> 제거, FruitBox box (메서드 중복정의가 됨)
        ArrayList<?> fruits = box.getItems();
        System.out.println(fruits);
    }

    //   지네릭 메서드, 제한조건 : extends만 사용가능
    public static <T extends Fruit> void make3(FruitBox<T>box){

    }


       // ? - Apple포함, Fruit, Object (super - 상한제한)
    public  static void make2(FruitBox<? super Apple>box){
        ArrayList<?> fruits = box.getItems();
        System.out.println(fruits);
    }


}



/*
* public class Jucier {
    public static void make(FruitBox<Apple> box){ //
         // 컴파일시 <Apple> 제거, FruitBox box (메서드 중복정의가 됨)
        ArrayList<Apple> fruits = box.getItems();
        System.out.println(fruits);
    }

    public static void make(FruitBox<Grape> box){// 컴파일시 <Grape> 제거

    }
}
* */