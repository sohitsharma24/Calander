import java.util.Scanner;

public class handshakes {
    public static void main(String[] args) {
        System.out.println("Enter number of students as input:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h= (n * (n - 1)) / 2;
        System.out.printf("total handshakes: %d",h);
    }

}
