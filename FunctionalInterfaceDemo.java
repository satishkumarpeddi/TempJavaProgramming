interface Calculation{
    int addition(int a,int b,int c);
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args){
        Calculation sum = (a,b,c)-> a+b+c ;
        System.out.println(sum.addition(1,2, 3));
    }
}
