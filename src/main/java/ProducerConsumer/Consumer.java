package ProducerConsumer;

public class Consumer implements Runnable{
    private Store store;
    Consumer(Store s){
        this.store=s;
    }
    @Override
    public void run(){
        while(true){
            synchronized (store){
                if(store.getItems().size()>0){
                    System.out.println("consumer consuming at"+store.getItems().size());
                    store.removeItem();
                }
            }
        }
    }
}
