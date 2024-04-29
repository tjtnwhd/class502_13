package exam02;

import java.util.ArrayList;
import java.util.Arrays;

// ArrayList - 여러개를 담을수 있는 공간
public class FruitBox<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void add(T fruit){
        items.add(fruit);
    }
    public ArrayList<T> getItems(){
        return items;
    }

}
