import java.util.Scanner;

public class Search_in_range {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER YOUR ARRAY : ");
        int[] arr= new int[10];
        for(int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("ENTER THE UPPER LIMIT AND THE LOWER LIMIT OF THE SEARCH ");
        int k= in.nextInt();;
        int l=in.nextInt();
        System.out.println("ENTER THE NUMBER YOU WANNA GET ");
        int m= in.nextInt();;
        range(arr,k,l,m);

    }
    static void range(int[] arr ,int i,int j, int target){
        for (int l=i;l< j;l++){
            if(arr[l]==target){
                System.out.println("YOUR INPUT NO"+arr[l]+" IS PRESENT AT "+l);
            }
        }
    }
}
