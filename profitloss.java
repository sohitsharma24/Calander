import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter costprice as input:");
        int cp=sc.nextInt();
        System.out.println("Enter sellingprice as input:");
        int sp=sc.nextInt();
        System.out.printf("the CP is INR %d and SP is INR %d. ",cp,sp);
        System.out.println("");
        System.out.printf("The profit is INR %d and the profit percentage is %d.",sp-cp,((sp-cp)/cp)*100);
    }

}
