package udemy;

public class Lambda {
    public static void main(String[] args) {
        ////1
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("run without lambda");
            }
        };
        new Thread(r).start();
        ////2
        Runnable rl=()->{
            System.out.println("run with lamda");
        };
        new Thread(rl).start();
        ////3
        new Thread(()->{System.out.println("lamda without craeting object");}).start();
    }
}

