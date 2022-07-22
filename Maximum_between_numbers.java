import java.util.Scanner;

public class Maximum_between_numbers {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);

        System.out.println("ENTER THE AMOUNT OF NUMBERS YOU WANT TO INPUT");
        int i = in.nextInt();
        int max2=0;
        for(int j =1;j<=i;j++){
            System.out.println("ENTER THE " +j +" NUMBER ");
            int k = in.nextInt();
            int max1 ;
            max1=k;

            if (max1>max2)
            {
                max2=max1;
            }
        }

        System.out.println("THE LARGEST NUMBER IS \n" + max2);



    }
}
