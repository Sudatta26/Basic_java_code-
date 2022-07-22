import java.util.Scanner;

public class Search_in_Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER YOUR STRING : ");
        String jana= in.nextLine();
        System.out.println("ENTER THE CHARACTER YOU WANNA SEARCH : ");
        char ch = in.next().charAt(0);
        System.out.println(search(jana,ch));
    }
    static boolean search(String jana, char target){
        for (int i =0;i<jana.length();i++){
            if (target== jana.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
