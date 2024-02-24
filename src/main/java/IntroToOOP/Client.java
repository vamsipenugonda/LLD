package IntroToOOP;

public class Client {
    public static  void main(String[] args){
        Student x=new Student();
        x.setAge(27);
        x.name="vamsi";
        x.batch="dsa";
        x.psp=96.99;
        Student y;
        y = x;
        x.name="VamsiP";
        System.out.println(y.name);
    }
}
