import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("ENTER THE FUNCTION YOU WANNA DO :\n");


        int res;
        while (true){
            System.out.println("1.ADDITION\n2.SUBTRACTION\n3.MULTIPLE\n4.DIVIDE\n5.MODULO\n6.EXIT\n");
            Scanner in = new Scanner(System.in);
            int i = in.nextInt() ;
           if(i==1 || i==2 || i==3 || i==4 || i==5)//you cant take and as then every rule must have to be followed
           {
            System.out.println("ENTER THE FIRST NUMBER :");
            int j = in.nextInt();
            System.out.println("ENTER THE SECOND NUMBER :");
            int k = in.nextInt();
            if (i == 1) {
                res = j + k;
                System.out.println("YOUR RESULT IS : " + res);
            }
            if (i == 2) {
                res = j - k;
                System.out.println("YOUR RESULT IS : " + res);
            }
            if (i == 3) {
                res = j * k;
                System.out.println("YOUR RESULT IS : " + res);
            }
            if (i == 4) {
                if (j > k) {
                    res = j / k;
                    System.out.println("YOUR RESULT IS : " + res);
                } else {
                    System.out.println("YOUR NUMBERS CAN'T BE DIVIDED ");
                }
            }
            if (i == 5) {
                res = j % k;
                System.out.println("YOUR REST IS : " + res);
            }
            }
           else if(i == 6){
                break;
            }
            else  {
                System.out.println("INVALID INPUT !!\n");
            }
        }
    }
}
