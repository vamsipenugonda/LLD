package PrintNumber;

public class PrintNumbers implements  Runnable{
    int Number;
     PrintNumbers(int x){
        this.Number=x;
    }
    @Override
    public void run(){
         System.out.println("Number is "+Number+".Thread is " +Thread.currentThread().getName());
    }

    //Creating the Obj we will assign the value,while running we will print
}
