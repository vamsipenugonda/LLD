package Genrics;

public class Pair<V,T> {
        V first;
        T second;
        public void setFirst(V id){
            this.first=id;
        }
        public  void setSecond(T name){
            this.second=name;
        }
        public void getFirst(){
            System.out.println(first);
            //return first;
        }
        public  void getSecond(){
            System.out.println(second);
            //return second;
        }
        public V dosomething(){
            return first;

        }
}
