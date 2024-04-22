package exam02;

    // 조상클래스 final이 붙어서 상속 불가
public class SportCar extends Car{
    public void start(){
        System.out.println("시동 걸기");
    }
    public void press(){
        System.out.println("악셀레이터 밟고");
    }
    public void turnOff(){
        System.out.println("시동 끄기");
    }
    /*
    public void run() {

    }*/

}
