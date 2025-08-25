import java.util.Scanner;

public class samaveragemarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in maths:");
        float maths=sc.nextFloat();
        System.out.println("Enter marks in physics:");
        float physics=sc.nextFloat();
        System.out.println("Enter marks in chem:");
        float chem=sc.nextFloat();
        System.out.printf("Sam's average mark in PCM is %f",(maths+physics+chem)/3);
    }
}
