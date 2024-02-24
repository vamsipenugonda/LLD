package PrintNumber;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import  java.util.concurrent.Executors;
public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(4);
        for(int i=0;i<10;i=i+1){
            PrintNumbers taskobj=new PrintNumbers(i);
            //taskobj.run();
            ex.execute(taskobj);
//            Thread t=new Thread(taskobj);
//            t.start();
        }
    }
}
