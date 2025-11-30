class Counter{
    int count;
    //Race Method
    // public void countMethod(){
    //     count++;
    // }
    public synchronized void countMethod(){
        count++;
    }
}
public class RaceCondition {
    static Counter counter = new Counter();
    public static void main(String[] args)throws Exception{
        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                counter.countMethod();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<1000;i++){
                counter.countMethod();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count  : "+counter.count);

    }
}
