package udemy;

import ProducerConsumer.Consumer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator {
    public static void main(String[] args) {
        Comparator<Integer> comp=( a, b)->{return -a.compareTo(b);};
        System.out.println(comp.compare(1,5));
        List<Integer> a= Arrays.asList(1, 7, 2, 3, 4);
        Collections.sort(a,comp);
        System.out.println(a);

        Consumer
    }
}
