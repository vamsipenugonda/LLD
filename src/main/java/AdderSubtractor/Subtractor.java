package AdderSubtractor;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value x;
    Subtractor(Value v){
        this.x=v;
    }
    @Override
    public Void call(){
        for(int i=0;i<5000;i++){
            this.x.value=this.x.value-i;
        }

        return null;
    }
}
