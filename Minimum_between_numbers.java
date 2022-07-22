import java.util.Scanner;

public class Minimum_between_numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("ENTER THE AMOUNT OF NUMBERS YOU WANT TO INPUT");
        int i = in.nextInt();
       int min2=0;
        for (int j = 1; j <= i; j++) {
            System.out.println("ENTER THE " + j + " NUMBER ");
            int k = in.nextInt();
            int min1;
            min1 = k;
            if(j==1){
                min2=k;
            }
            else if (min2 >min1) {
                min2 = min1;
            }
        }

        System.out.println("THE SMALLEST NUMBER IS \n" + min2);

    }
}