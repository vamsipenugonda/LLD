package ProducerConsumerSemaphore;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxsize;
    private ConcurrentLinkedDeque<Object> items;
    Store(int x){
        this.maxsize=x;
        this.items=new ConcurrentLinkedDeque<>();
    }
    public int getMaxsize(){
        return this.maxsize;
    }
    ConcurrentLinkedDeque<Object> getItems(){
        return this.items;
    }
    void addItem(){
        System.out.println("producer producing at"+items.size());
        this.items.add(new Object());
    }
    void removeItem(){
        System.out.println("Consumer consuming at"+items.size());
        this.items.remove();
    }

}
