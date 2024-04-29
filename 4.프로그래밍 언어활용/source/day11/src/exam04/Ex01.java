package exam04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 추가, 조회, 삭제
public class Ex01 {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        LinkedList<String> names = new LinkedList<>(); // 호환성
        List<String> names = new ArrayList<>(); // 다형성

          // 추가한 순서 유지
        names.add("이름3");
        names.add("이름4");
        names.add("이름1");
        names.add("이름5");
        names.add("이름2");
        // 배열 index 순서대로 삭제될때마다 또다른 배열을 생성
        //index 0 = 5 -> 4
//        for(int i =0; i < names.size(); i++){
//            names.remove(i);
//        }
        // 배열을 반대(역순)로 하면 온전히 삭제 완료 (스택구조)
        for(int i = names.size()-1; i>=0; i--){
            names.remove(i);

        }

        for(int i =0; i < names.size(); i++){ // names.size() : 요소의 갯수
            String name = names.get(i);
            System.out.println(name);
        }

//        System.out.println(names);//names.toString();
//                                       -> 담긴 값을 확인할 수 있도록 재정의


    }
}
