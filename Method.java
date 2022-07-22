import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
      //  int show= sum(a,b);
        String ph= gretting();
        System.out.println("THIS IS THE RESULT  : " +ph);

    }
    static int sum(int a,int b){
      int multi = a*b;
      return (multi);

    }
    static String gretting(){
        Scanner in = new Scanner(System.in);
        String gh = in.nextLine();
        String sh = "hey there";
        return (gh);
    }
}
