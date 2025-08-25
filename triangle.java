import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base in cm as input:");
        int b=sc.nextInt();
        System.out.println("Enter height in cm as input:");
        int h=sc.nextInt();
        double areaInInches = 0.5 * (b / 2.54) * (h / 2.54);
        int areaInCm = (int)(0.5 * b * h);
        System.out.printf("The area in square inches is %f and square centimeters %d",areaInInches,areaInCm);
    }

}
