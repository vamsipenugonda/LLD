package ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    private Semaphore prodSema;
    private  Semaphore consSema;
    Consumer(Store s,Semaphore prodSema,Semaphore consSema){
        this.store=s;
        this.prodSema=prodSema;
        this.consSema=consSema;
    }
    @Override
    public void run(){
        while(true){
            //synchronized (store){
                try {
                    consSema.acquire();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Consumer consuming at"+store.getItems().size());
                store.removeItem();
                prodSema.release();
            //}
        }
    }
}
