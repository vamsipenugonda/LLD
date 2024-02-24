package AdderSubtractorSyncMethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static  void main(String[] args) throws ExecutionException, InterruptedException{
        Lock lock=new ReentrantLock();
        Value V=new Value();
        Adder x=new Adder(V,lock);
        Subtractor y=new Subtractor(V,lock);
        ExecutorService ex= Executors.newCachedThreadPool();

        Future<Void> f1=ex.submit(x);
        Future<Void> f2=ex.submit(y);
        f1.get();
        f2.get();
        System.out.println(V.value);



    }

}
