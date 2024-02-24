package HelloWorldPrint;

public class HelloPrinter implements Runnable{
        public void doSomething(){
            System.out.println("3Doing Something in"+Thread.currentThread().getName());
        }
        @Override
        public void run(){
            System.out.println("2Thread in "+Thread.currentThread().getName());
            doSomething();
        }
}
