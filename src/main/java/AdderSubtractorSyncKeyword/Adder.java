package AdderSubtractorSyncKeyword;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value x;
    private Lock lock;
    Adder(Value a, Lock l){
        this.x=a;
        this.lock=l;
    }
    @Override
    public Void call() throws Exception {
        for(int i=0;i<100;i++){
            //lock.lock();
            synchronized (x) {
                System.out.println("Adder lock at" + i);
                this.x.value = this.x.value + i;
                //lock.unlock();
            }
        }
        return null;
    }
}
