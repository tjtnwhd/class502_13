package exam01;
   // Box<T> : 지네릭스 클래스,   Box : 윈시타입
        // T 는 Fruit의 하위클래스 (정보가 더 많아짐)
        //  Eatable 인터페이스도 구현해야된다. (정보가 더더 많아짐) (&, implement X - 형식)
public class Box<T extends Fruit & Eatable>{     // <> : 타입 매개변수 ( T - Type 용도의 따라서 알아서 작성 )
    // T는 객체가 생성하는 시점
    private T item;
//    private static T item2; // 사용불가 , 처음부터 공간을 할당 받으므로 자료형이 명확해야함.
     // private static T[] nums = new T[3];
        // 사용 불가, 배열에서 공간 생성을 위해서는 자료형이 명확해야함

    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return item;
    }
    public String toString(){
    return item.get();

        // T == Object, 아직 Apple 될지 모름 지금은 Object
    }


}

/*   Apple 투입 컴파일 전
package exam01;
public class Box<Object> {
    private Apple item;


    public void setItem(Object item){
        this.item = item;

    }
    public Object getItem(){
        return item;
    }
}
자료형을 Object
*   모든 클래스들은 Object의 하위 클래스임을 컴파일러가 알고 있으니까

!!컴파일시 <T> 제거, 객체가 만들어질때 투입한 자료형으로 변환
 객체가 만들어지기 전이면 T가 어떤걸로 변환될지 아직 모름
 그래서 지네릭타입에는 *상수* 또는 *배열*이 사용 불가한다.!!


* */



/*     Apple 투입 컴파일 후
public class Box<Apple> {
    private Apple item;


    public void setItem(Apple item){
        this.item = item;

    }
    public Apple getItem(){
        return item;
    }
}
*
* */





/*
 <T extends Fruit > -> T는 Fruit의 하위 클래스임을 알수 있음 -> Object 보다는 Fruit로 변환


* public class Box<T extends Fruit>{
    private Fruit의 item;

    public void setItem(Fruit item){
        this.item = item;
    }
    public Fruit getItem(){
        return item;
    }
    public String toString(){
       return item.get();  // get() 메서드 사용 가능
    }


}
*/