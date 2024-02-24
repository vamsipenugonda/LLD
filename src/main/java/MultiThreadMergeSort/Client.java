package MultiThreadMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException,InterruptedException {
        List<Integer> arr = List.of(1, 3, 4, 5, 6, 7);
        ExecutorService exe = Executors.newCachedThreadPool();
        Sorter task = new Sorter(arr, exe);
        Future<List<Integer>> f = exe.submit(task);
        List<Integer> ans =f.get();
        System.out.println(ans);

    }
}


