import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1 as input:");
        int t=sc.nextInt();
        System.out.println("Enter number 2 as input:");
        int t1=sc.nextInt();
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %d and %d is %d, %d, %d, and %d",t,t1,t+t1,t-t1,t*t1,t/t1);
    }

}
