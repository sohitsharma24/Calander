import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius in km as input:");
        float r=sc.nextInt();
        float a=(float) (r*(1.6));
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",(4/3)*Math.PI*r*r*r,(4/3)*Math.PI*a*a*a);
    }

}
