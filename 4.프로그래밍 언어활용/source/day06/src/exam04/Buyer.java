package exam04;

public interface Buyer {
    void buy();

   default void order(){
       // (default)를 추가하면 컴파일러가 완전히 구현된 인스턴스 메서드로 사용 가능
       // (default)를 추가하지 않으면 컴파일러가 추상메서드로 인식한다.
        System.out.println("Buyer에서 주문");

       privateMethod();
    }
private void privateMethod(){
       // 인스턴스 메서드 내부에서 사용목적으로 자바9부터 사용가능

}
}
