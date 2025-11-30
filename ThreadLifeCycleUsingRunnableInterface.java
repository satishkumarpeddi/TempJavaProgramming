import java.io.*;
class ThreadA implements Runnable{
    @Override 
    public void run(){
        try{
            System.out.println("Thread A : "+Thread.currentThread().getState());
            Thread.sleep(1000);
        }catch(Exception e){
            
        }
    }
}
public class ThreadLifeCycleUsingRunnableInterface {
    public static void main(String[] args)throws Exception{
        Thread thread = new Thread(new ThreadA());
        System.out.println("Initial State : "+thread.getState());
        thread.start();
        System.out.println("After start : "+thread.getState());
        Thread.sleep(100);
        System.out.println("During sleep: "+thread.getState());
        Thread.sleep(1500);
        System.out.println("Final State : "+thread.getState());
    }
}
