import java.util.*;
public class qn9 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the principle: ");
    double principal = sc.nextFloat();
    System.out.println("Enter the rate: ");
    double rate = sc.nextFloat();
    System.out.println("Enter the principal: ");
    double time = sc.nextFloat();
    double simpleInterest = (principal*rate*time)/100;
    System.out.println("The interest amount is " +simpleInterest);
    sc.close();
    }
}

