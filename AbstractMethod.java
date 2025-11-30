
abstract class Vehicle{
    abstract void start();
    void stop(){
        System.out.println("Vehicle stopped");
    }
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car starting..");
    }
}
public class AbstractMethod {
    
    public static void main(String[] args){
        Vehicle car = new Car();
            car.start();
            car.stop();
            
    }
}
