class InterruptedException extends Exception{
    InterruptedException(String message){
        super(message);
    }
}
class VoterChecker{
    public void check(int age)throws InterruptedException{
        if(age<18)
                throw new InterruptedException("You can't cast your age");
        else
                System.out.println("You can cast your vote");
    }
}
public class ExceptionError{
    public static void main(String[] args){
        VoterChecker voterChecker = new VoterChecker();
        try{
            voterChecker.check(17);   
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}