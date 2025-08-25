import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        System.out.println("Enter perimeter as input:");
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        System.out.printf("The length of the side is %d whose perimeter is %d",p/4,p);
    }

}
