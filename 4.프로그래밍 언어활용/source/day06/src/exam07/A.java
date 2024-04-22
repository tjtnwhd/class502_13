package exam07;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// Adapter 는 다중상속이 불가여서 사용 X
public class A extends MouseAdapter {
    // MouseAdapter 인터페이스 기본 구현 크래스

    @Override
    public void mouseClicked(MouseEvent e){

    }
}

    //추상 메서드 int square(int num);
    // 모든 클래스가 square를 필요로 하지 않는다.
    // 기본 구현된 Adapter 클래스를 제공




//public class A implements MouseListener {
//MouseListener의 구현부를 다 작성하지 않으면 사용 불가
    // 구현부를 비우더라도 다 정의해야한다. - 선언부 {}
