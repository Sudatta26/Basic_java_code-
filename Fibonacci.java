import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int i =0 , j =1;
        System.out.println("INPUT TILL THE NO YOU WANT THE SERIES");
        Scanner in = new Scanner(System.in);
        int k=in.nextInt();
        int sum=0 ;
        System.out.println("YOUR FIBONACCI SERIES IS\n" + i+"\n" +j);
        while (sum<k)
        {
            sum=i+j;
           if(sum<k) {
                System.out.println(sum);
                i = j;
                j = sum;
            }

        }
    }
}
