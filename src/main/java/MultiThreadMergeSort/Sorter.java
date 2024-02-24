package MultiThreadMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>>{
    public  List<Integer> arr;
    public ExecutorService exe;
    Sorter(List<Integer> a,ExecutorService ex){
        this.arr=a;
        this.exe=ex;
    }
    @Override
    public List<Integer> call() throws Exception{
        if(arr.size()<=1){return arr;}
        int mid=arr.size()/2;
        List<Integer> left=new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        for(int i=0;i<mid;i++){
            left.add(arr.get(i));
        }
        for(int i=mid;i<arr.size();i++){
            right.add(arr.get(i));
        }
        Sorter leftsorter=new Sorter(left,exe);
        Sorter rightsorter=new Sorter(right,exe);
        Future<List<Integer>> leftfuture=exe.submit(leftsorter);
        Future<List<Integer>> rightfuture=exe.submit(rightsorter);
        List<Integer> sortedleft=leftfuture.get();
        List<Integer> sortedright=rightfuture.get();
        List<Integer> ans=new ArrayList<>();
        int i=0;int j=0;
        while(i<sortedleft.size() && j<sortedright.size()){
            if(sortedleft.get(i)<sortedright.get(j)){
                ans.add(sortedleft.get(i));
                i++;
            }
            else{
                ans.add(sortedright.get(j));
                j++;
            }
        }
        while(i<sortedleft.size()){
            ans.add(sortedleft.get(i));
            i++;
        }
        while(j<sortedright.size()){
            ans.add(sortedright.get(j));
            j++;
        }
        return ans;
    }
}


