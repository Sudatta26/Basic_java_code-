import java.util.Arrays;
import java.util.Scanner;

public class Reverse_an_array {
    public static void main(String[] args) {
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        Scanner in= new Scanner(System.in);
        int o= in.nextInt();
        int[] arr = new int[o];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY ");
        for(int i=0;  i<o;i++){
            arr[i]=(in.nextInt());}
        System.out.println("YOUR ARRAY IS "+ Arrays.toString(arr));
       Reverse(arr);
        System.out.println("YOUR REVERSED ARRAY IS "+Arrays.toString(arr));

    }
    static void Reverse(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);//though start and end are the the using numbers here but when itd goes in the swap method its uses the elements of the array
            start++;
            end--;

        }

    }static void swap(int[] arr,int index1 ,int index2 ){//here its taking the values of the array by using arr[index no ]
        int s= arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= s;
    }

}
