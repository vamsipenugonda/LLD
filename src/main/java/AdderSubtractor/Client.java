package AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static  void main(String[] args) throws ExecutionException, InterruptedException{
        Value V=new Value();
        Adder x=new Adder(V);
        Subtractor y=new Subtractor(V);
        ExecutorService ex= Executors.newCachedThreadPool();

        Future<Void> f1=ex.submit(x);
        Future<Void> f2=ex.submit(y);
        f1.get();
        f2.get();
        System.out.println(V.value);



    }

}
