class VehicleThread extends Thread{
    String name;
    int priority;
    VehicleThread(String name,int priority){
        this.name=name;
        this.priority=priority;
    }
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(getName()+" is moving ..... (Priority: "+getPriority()+")");
        }
    }
}
public class ThreadPriority {
    public static void main(String[] args){
        VehicleThread ambulance = new VehicleThread("Ambulance", Thread.MAX_PRIORITY);
        VehicleThread car = new VehicleThread("Car",Thread.NORM_PRIORITY);
        VehicleThread truck = new VehicleThread("Delivery Truck ",Thread.MIN_PRIORITY);
        ambulance.start();
        car.start();
        truck.start();
    }
}
