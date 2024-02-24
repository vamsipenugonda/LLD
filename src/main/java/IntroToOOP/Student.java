package IntroToOOP;

public class Student {
    int age;
    public String  batch;
    public String name;
    double psp;
    protected int gradyear;
    void do_something (){
        System.out.println("Something is being done");
    }
    int getAge(){
        return age;
    }
    void setAge(int x){
        if(x>25){
            this.age=x;
        }
    }



}
