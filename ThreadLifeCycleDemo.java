import java.io.*;
class ThreadA extends Thread{
    @Override
    public void run(){
        try{
            System.out.println("Thread state : "+Thread.currentThread().getState());
            Thread.sleep(1000);
        }catch(Exception e){
            // System.out.println(e.getMessage());
        }
    }
}
public class ThreadLifeCycleDemo {
    public static void main(String[] args)throws Exception{
        ThreadA thread = new ThreadA();
        System.out.println("New Born State : "+thread.getState());
        thread.start();
        System.out.println("Runnable State : "+thread.getState());
        Thread.sleep(100);
        System.out.println("During sleep : "+thread.getState());
        Thread.sleep(1500);
        System.out.println("Final State : "+thread.getState());
    }
}
