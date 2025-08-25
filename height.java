import java.util.Scanner;

public class height {
    public static void main(String[] args) {
        System.out.println("Enter height in cm as input:");
        Scanner sc=new Scanner(System.in);
        float h=sc.nextFloat();
        System.out.printf("Your Height in cm is %f while in feet is %f and inches is %f",h,h/2.54,(h/2.54)/12);
    }

}
