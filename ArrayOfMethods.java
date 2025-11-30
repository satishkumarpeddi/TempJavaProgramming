class ArrayMethods{
    void sum(int a,int b){
        System.out.println("Sum of two numbers: "+(a+b));
    }
    void sub(int a,int b){
        System.out.println("Difference of two numbers: "+(a-b));
    }
    void mul(int a,int b){
        System.out.println("Multiplication of two numbers: "+(a*b));
    }
    void div(int a,int b)throws ArithmeticException{
        System.out.println("Division of two numbers: "+(a/b));
    }
   
}
public class ArrayOfMethods {
    public static void main(String[] args){
        ArrayMethods[] arrMethods = new ArrayMethods[5];
        for (int i = 1; i <=4; i++) {
            arrMethods[i] = new ArrayMethods();
        }
        for(int i=1;i<=4;i++){
            arrMethods[i].sum(i, i);
            arrMethods[i].sub(i, i);
            arrMethods[i].mul(i, i);
            arrMethods[i].div(i, i);
            System.out.println("---------------------------------------");
        }
    }
}
