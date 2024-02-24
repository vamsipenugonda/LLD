package AdderSubtractorSyncMethod;

public class Value {
    public int value=0;
    public synchronized  void increment(int x){
        value=value+x;
    }
    public  synchronized  void  decrement(int x){
        value=value-x;
    }
}
