import java.util.Scanner;

public class Counting_Occurence {
    public static void main(String[] args) {
        System.out.println("ENTER YOUR NUMBER");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.println("ENTER THE NUMBER YOU WANT TO BE COUNTED");
        int j = in.nextInt();
        int count=0;
        while (i>-0){
            int rem1=i/10;//it devides the number by 10 so the last digit gets cancel out and others remains
            int rem2=i%10;//it is the reminder so that we can know whats the number
            if (rem2==j){
               count++;
            }
            i=rem1;
        }
        System.out.println("TOTAL NO OF " +j+"s are "+ count);
    }
}
