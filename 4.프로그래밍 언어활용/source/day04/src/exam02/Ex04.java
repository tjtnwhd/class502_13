package exam02;

public class Ex04 {
    public Ex04() {
    }

    public static void main(String[] args) {
        A ad = new D();
        ad.numA = 15;
        System.out.println(ad.numA);
        A ac = new C();

        if(ad instanceof C){
            System.out.println();
        }
        if(ac instanceof C){
            C cc = (C)ac;
            System.out.println(cc.numA);
        }
//        if (ad instanceof C c) {
//            System.out.println(c.numA);
//        }
//
//        if (ac instanceof C c) {
//            System.out.println(c.numA);
//        }

    }
}
