package exam04;

public interface Seller {
    void sell();

    default void order(){
        System.out.println("Seller에서 주문");
        // (default)를 추가하면 컴파일러가 완전히 구현된 인스턴스 메서드로 사용 가능
        // (default)를 추가하지 않으면 컴파일러가 추상메서드로 인식한다.
    }
    public static void staticMethod(){
    System.out.println("정적 메서드, 인터페이스 이든,클래스이든 원래부터 사용 가능");
    }

}
