public class DeadlockDemo {
    public static void main(String[] args){
        String resource1 = "Resource 1";
        String resource2 = "Resource 2";
        Thread t1 = new Thread(()->{
            synchronized(resource1){
                System.out.println("Thread 1 locked Resource 1 ");
                // try{
                //     Thread.sleep(1000);
                // }catch(Exception e){
                //     e.printStackTrace();
                // }
                synchronized(resource2){
                System.out.println("Thread 1 locked Resource 2 ");
                }
            }
        });
        Thread t2 = new Thread(()->{
            synchronized(resource2){
                System.out.println("Thread 2 locked Resource 2 ");
                // try{
                //     Thread.sleep(1000);
                // }catch(Exception e){
                //     e.printStackTrace();
                // }
                synchronized(resource2){
                System.out.println("Thread 2 locked Resource 1 ");    
                }
            }
        });
        t1.start();
        t2.start();
    }
}
