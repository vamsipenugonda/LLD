package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int maxsize;
    List<Object> items;
    Store(int x){
        this.maxsize=x;
        this.items=new ArrayList<>();
    }
    int getMaxsize(){
        return this.maxsize;
    }
    List<Object> getItems(){
        return this.items;
    }
    void addItem(){
        System.out.println("producer producing at"+items.size());
        items.add(new Object());
    }
    void removeItem(){
        System.out.println("Comsumer consumin at"+items.size());
        items.remove(items.size()-1);
    }

}
