import java.io.*;
class ThreadA extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread A  : "+i);
        }
    }
}
class ThreadB extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread B : "+i);
        }
    }
}
public class MultiThreadingUsingThreadClass {
    public static void main(String[] args)throws IOException{
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();
    }
}
