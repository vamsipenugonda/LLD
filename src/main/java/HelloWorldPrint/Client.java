package HelloWorldPrint;

public class Client {
    public static void main(String[] args) {
        HelloPrinter task1=new HelloPrinter();
        Thread t=new Thread(task1);
        t.start();
        System.out.println("1ThreadName :"+ Thread.currentThread().getName());
    }
}
