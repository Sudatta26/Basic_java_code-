import java.util.Arrays;
import java.util.Scanner;

public class Maximum_number_in_the_array {
    public static void main(String[] args) {
        System.out.println("ENTER THE SIZE OF THE ARRAY ");
       Scanner in= new Scanner(System.in);
        int o= in.nextInt();
        int[] arr = new int[o];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY ");
        for(int i=0;  i< arr.length;i++){
            arr[i]=(in.nextInt());}
        System.out.println("YOUR ARRAY IS "+ Arrays.toString(arr));
        System.out.println("THE MAXIMUM NUMBER IN THE ARRAY IS "+max(arr));//in the max method its returning  maxval so we dont need to call the method outside of the sout
    }//if it wasnt returning anything like the void swap method we must had call it outside sout and yhe we need to print the array
    static int max(int[] arr){
        int maxval = arr[0];
        for (int i=0;i<arr.length;i++){
            if (maxval < arr[i]){
                    maxval=arr[i];
            }
        }
        return maxval;

    }
}
