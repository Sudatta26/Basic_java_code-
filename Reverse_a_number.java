import java.util.Scanner;

public class Reverse_a_number{
    public static void main(String[] args) {
        System.out.println("ENTER YOUR NUMBER");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int ans =0;
        while (i > 0) {
            int rim1= i/10;//we are making it small
            int rim2= i%10;//we are taking the last digit from here
            ans= (ans*10) + rim2;//here we are taking the last digit and multiplying it with 10 so that it can come first
            i=rim1;
        }
        System.out.println("YOUR REVERSE NO IS "+ ans);
    }

}
