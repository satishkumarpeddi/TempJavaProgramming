class ThreadA implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread A : "+i);
        }
    }
}
class ThreadB implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++)
                System.out.println("Thread B : "+i);
    }
}
public class MultiThreadingUsingRunnableInterface {
    public static void main(String[] args){
        Thread threadA = new Thread(new ThreadA());
        Thread threadB = new Thread(new ThreadB());
        threadA.start();
        threadB.start();
    }
}
