package exam03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Class 클래스 사용 예제  - 정보 조회만 가지고 있는 객체 (접근가능한 모든게 나온다.)
public class Ex08 {
    public static void main(String[] args) {
        Class cls1 = Person.class; // class 자동생성

        Field[] fields = cls1.getFields();
        Method[] methods = cls1.getMethods();
        Constructor[] constructors = cls1.getConstructors();

        System.out.println("------Field-------");
        for(Field field : fields){
            System.out.println(field); // field.toString()
        }
        System.out.println("-------Construtor--------");
        for(Constructor constructor: constructors){
            System.out.println(constructor); // constructor.toString();
        }
        System.out.println("-------Method--------");
        for(Method method : methods){
            System.out.println(method); // method.toString()
        }

        Person person = new Person();
        Class cls2 = person.getClass(); // 클래스 내부에서 샤용할 목적
    }
}
