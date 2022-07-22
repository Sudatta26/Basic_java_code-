import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER YOUR NO :");
        int i = in.nextInt();
        ams(i);
    }
    static void ams(int i) {
        int sum = 0;
        int sum1=i;// i is gonna be changed again and again in while loop so i cant be same with sum, you have to take an another variable to store the value of (i)
        while (i > 0) {
            int j = i % 10;
            i = i / 10;
            sum = (j * j * j) + sum;//first sum is 0 , the its the cube of j with sum
        }
        if (sum == sum1) {
            System.out.println("THIS IS AMSTRONG NUMBER");
        } else {
            System.out.println("THIS IS NOT AN AMSTRONG NUMBER");
        }
    }
}
