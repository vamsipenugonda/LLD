package ProducerConsumer;

public class Producer implements Runnable{
    Store store;
    Producer(Store s){
        this.store=s;
    }
    public  void run(){
        while(true){
            synchronized (store){
                if(store.getItems().size()<store.getMaxsize()){
                    System.out.println("producer producing at"+store.getItems().size());
                    store.addItem();
                }
            }
        }
    }
}
