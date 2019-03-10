package test;

public class LazySingletonTest {


    public static void main(String[] args) {

        try {
            Thread thread = new Thread(new ExectorThread());
            Thread thread1 = new Thread(new ExectorThread());
            thread.start();
            thread1.start();
        }catch (Exception e){

            e.printStackTrace();
        }

    }
}
