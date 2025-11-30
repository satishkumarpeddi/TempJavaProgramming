import java.util.*;
public class BinarySearchUsingCommandLineArgs {

    public  static int binarySearch(String[] args,int low,int high,int searchElement){
        if(low<high){
            int mid= (low+high)/2;
            // if(Integer.parseInt(args[mid])==searchElement)
            if(String.valueOf(searchElement).equals(args[mid]))
                    return mid+1;
            if(searchElement>Integer.parseInt(args[mid])){
                return binarySearch(args,mid+1,high,searchElement);
            }else{
                return binarySearch(args, low, mid-1, searchElement);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int  n = args.length;
        int low = 0,high=n-1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched : ");
        int searchElement = sc.nextInt();
        int value =  binarySearch(args,low,high,searchElement);
        System.out.println("Element found at index : "+value);
    }
}
