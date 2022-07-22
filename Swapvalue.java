
import java.util.Arrays;
import java.util.Scanner;

public class Swapvalue {
    public static void main(String[] args) {
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        Scanner in= new Scanner(System.in);
        int o= in.nextInt();
        int[] arr = new int[o];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY ");
        for(int i=0;  i<o;i++){
        arr[i]=(in.nextInt());}
        System.out.println("YOUR ARRAY IS "+ Arrays.toString(arr));
        System.out.println("ENTER THE THE INDEXES OF THE NUMBER YOU WANT TO SWAP");
        int j = in.nextInt();
        int k = in.nextInt();
        swap(arr,j,k);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1 ,int index2 ){
        int s= arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= s;
    }
}
