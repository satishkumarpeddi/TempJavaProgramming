interface Vehicle{
    void drive();
    default void start(){
        System.out.println("Car is starting.....");
    }
    static void service(){
        System.out.println("Car is servicing....");
    }
}
class Car implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Car is been driving.....");
    }
}
public class DefaultStaticInterfaceDemo {
    public static void main(String[] args){
        Car car = new Car();
        car.drive();
        car.start();
        Vehicle.service();
    }
}
