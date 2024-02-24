package AdderSubtractor;
import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private  Value x;
    Adder(Value a){
        this.x=a;
    }
    @Override
    public Void call() throws Exception {
        for(int i=0;i<5000;i++){
            this.x.value=this.x.value+i;
        }
        return null;
    }
}
