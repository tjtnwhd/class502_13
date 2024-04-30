package exam99;
// 싱글톤 예제 : 필요할때 하나만 생성해서 공유
public class Company {
    private static Company instance = new Company();
    private Company(){} // 통제

        public static Company getInstance(){// static
        if(instance == null){
            instance = new Company();
        }
        return instance;
        }
}
