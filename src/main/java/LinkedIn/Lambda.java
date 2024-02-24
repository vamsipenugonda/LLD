package LinkedIn;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
        Predicate<String> largerthan5=s->s.length()>5;
        boolean k=largerthan5.test("hiiii");
        System.out.println(k);
        Consumer<String> upper=s-> System.out.println(s.toLowerCase());
        upper.accept("heLLo");
        //Method reference:can be used for new methods
        //shorter way of lambda,only be used in existing methods,Syntax-::
    }
}
