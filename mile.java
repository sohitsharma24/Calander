import java.util.Scanner;

public class mile {
    public static void main(String[] args) {
        System.out.println("Enter feet as input:");
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        System.out.printf("the distance in yards %.2f and in miles is %.2f. ",f/3,f/(3*1760));
    }

}
