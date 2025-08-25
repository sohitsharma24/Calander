import java.util.Scanner;

public class kmtomile {
    public static void main(String[] args) {
        System.out.println("Enter km as input:");
        Scanner sc=new Scanner(System.in);
        float km=sc.nextFloat();
        System.out.printf("the distance %.2f km in miles is %.2f. ",km,km*1.6);
    }

}
