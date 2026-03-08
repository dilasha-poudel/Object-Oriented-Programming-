import java.util.*;
public class qn9 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the principle: ");
    double principle = sc.nextFloat();
    System.out.println("Enter the rate: ");
    double rate = sc.nextFloat();
    System.out.println("Enter the principle: ");
    double time = sc.nextFloat();
    double simpleInterest = (principle*rate*time)/100;
    System.out.println("The interest amount is " +simpleInterest);
    sc.close();
    }
}
