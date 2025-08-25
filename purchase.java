import java.util.Scanner;

public class purchase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter unit price as input:");
        int u=sc.nextInt();
        System.out.println("Enter quantity as input:");
        int q=sc.nextInt();
        System.out.printf("The total purchase price is INR %d if the quantity %d and unit price is INR %d",q*u,q,u);
    }

}
