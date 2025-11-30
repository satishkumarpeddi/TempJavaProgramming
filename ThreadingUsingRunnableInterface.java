class MyThread implements Runnable{
    @Override
    public void run(){
        System.out.println("My Threading is running");
    }
}
public class ThreadingUsingRunnableInterface {
    public static void main(String[] args){
        Thread thread = new Thread(new MyThread());
        thread.start();
    }
}
