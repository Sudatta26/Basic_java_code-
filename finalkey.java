import java.util.Scanner;

 public class finalkey {
    private double rad,perimeter;
    private double pie = 3.14;

    Scanner in = new Scanner(System.in);

    public void perimeterOfCircle()
    {
        System.out.println("enter the radius of circle");
        rad = in.nextDouble();
        perimeter = 2*rad*pie;
        System.out.println("The perimeter of circle : "+perimeter);

    }
    public void changefinal()
    {
        pie = 30;
    }

    public static void main(String[] args) {
        finalkey fin = new finalkey();
        fin.changefinal();
        fin.perimeterOfCircle();

    }
}
