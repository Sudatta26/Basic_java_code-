
import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        Scanner  in= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int m= in.nextInt();
        System.out.println("Enter your sorted array");
        int[] arr = new int[m];
        for(int i =0;i< arr.length;i++ ){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target element ");
        int target =  in.nextInt();
        int som=search(arr,target);
        System.out.println("Your element is in   "+som+"   index");

    }

    static int search(int[] arr, int target){
       // System.out.println(Arrays.toString(arr));
       // System.out.println(target);
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start +end )/2 ;
            if(target ==arr[mid]){
                return mid;
               // System.out.println(start);
            }
            else if(target<arr[mid]){
                end=mid - 1;
                //System.out.println(end);
            }
            else {
                start=mid +1;}
        }


        return -1;
    }
}
