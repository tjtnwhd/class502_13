package exam01;

public class SimpleCalculator extends Calculator{
    public SimpleCalculator(){
        super();
    }
    public int add(int num1, int num2){
        return num1 + num2;
    }

//    @Override
//    final public void commonMethod() {
//        super.commonMethod();
    //  // 조상메서드에서 final 사용하면 자손 메서드에서 정의 불가
    //    }
}
