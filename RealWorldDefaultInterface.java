interface PaymentGateway{
    void pay(double amount);
    default void paymentReceipt(){
        System.out.println("Payment receipt generated successfully!");
    }
}
class UPI implements PaymentGateway{
    @Override
    public void pay(double amount){
        System.out.println("Payment of $"+amount+" done via UPI.");
    }
}
class CreditCard implements PaymentGateway{
    @Override
    public void pay(double amount){
        System.out.println("Payment of $"+amount+" done using Credit Card");
    }
    @Override
    public void paymentReceipt(){
        System.out.println("Credit Card Payment receipt eamiled!");
    }
}
public class RealWorldDefaultInterface {
    public static void main(String[] args){
        PaymentGateway upi = new UPI();
        upi.pay(1000);
        upi.paymentReceipt();
        PaymentGateway creditCard = new CreditCard();
        creditCard.pay(1000000);
        creditCard.paymentReceipt();
    }
}
