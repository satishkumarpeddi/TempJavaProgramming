class Buffer{
    private int data;
    private boolean hasData=false;
    public synchronized void produce(int value){
        try{
            while(hasData)
                wait();
            data=value;
            System.out.println("Produced : "+data);
            hasData=true;
            notify();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public synchronized int cousume(){
        int value=0;
        try{
            while(!hasData){
                wait();
            }
            value = data;
            System.out.println("Consumed : "+value);
            hasData=false;
            notify();
        }catch(Exception e){
            e.printStackTrace();
        }
        return value;
    }
}
public class InterCommunicationThread{
    public static void main(String[] args){
        Buffer buffer = new Buffer();
        Thread producer = new Thread(()->{
           for(int i=0;i<5;i++)
                 buffer.produce(i);
                try{
                    Thread.sleep(500);
                }catch(Exception e){
                    e.printStackTrace();
                }
        });
        Thread cosumer = new Thread(()->{
            for(int j=0;j<5;j++){
                 buffer.cousume();
                try{
                    Thread.sleep(500);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        producer.start();
        cosumer.start();
    }
}