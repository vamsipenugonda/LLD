package ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    Store store;
    Semaphore prodSema;
    Semaphore consSema;

    Producer(Store s, Semaphore prodSema, Semaphore consSema) {
        this.prodSema = prodSema;
        this.consSema = consSema;
        this.store = s;
    }
    @Override
    public void run() {
        while (true) {
           // synchronized (store) {
                try {
                    prodSema.acquire();
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Producer producing at" + store.getItems().size());
                store.addItem();
                consSema.release();
           // }
        }
    }
}

