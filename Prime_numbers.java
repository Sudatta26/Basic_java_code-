import java.util.Scanner;

public class Prime_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int k = in.nextInt();
        prime(k);

    }
    static void prime(int n){
        int i=2, count =0;
        while (i<n){
            if(n%i==0){
              count=count+1;//we have to take a count here as we cant print again and again

              break;
            }
            i++;//we must have increase i unless it will be an infinite loop
        }
        if (count == 1) {
            System.out.println("THIS IS NOT A PRIME NUMBER");
        }
        else{
            System.out.println(" THIS IS A PRIME NUMBER");

        }


    }
}
