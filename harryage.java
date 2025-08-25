import java.util.Scanner;

public class harryage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the birth year: ");
        int age=sc.nextInt();
        System.out.printf("Harry's age in 2024 is %d",2024-age);
    }
}
