package AdderSubtractorSyncMethod;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value x;
    private Lock lock;
    Subtractor(Value v, Lock lock){
        this.x=v;
        this.lock=lock;
    }
    @Override
    public Void call(){
        for(int i=0;i<100;i++) {
            //lock.lock();
            //synchronized (x) {
            System.out.println("Subtractor locked at" + i);
            x.decrement(i);
            //this.x.value = this.x.value - i;

            //lock.unlock();
        //}
        }

        return null;
    }
}
