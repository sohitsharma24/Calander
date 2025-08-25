import java.util.Scanner;

public class distribution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total no. of pen as input:");
        int t=sc.nextInt();
        System.out.println("Enter total no. of student as input:");
        int t1=sc.nextInt();
        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed is %d",t/t1,t%t1);
    }

}
