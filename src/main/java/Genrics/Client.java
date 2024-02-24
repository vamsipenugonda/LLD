package Genrics;

public class Client {
    public static void main(String[] args) {
//        Iterator
//        List<String> fruits=new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Kiwi");
//        Iterator<String> itr=fruits.iterator();
//        while(itr.hasNext()){
//            String fruit=itr.next();
//            System.out.println(fruit);
//
//        }
        Pair<Integer,String> p1=new Pair<>();
        p1.setFirst(1);
        p1.getFirst();
        Integer k=p1.dosomething();
        System.out.println(k);


    }
}
