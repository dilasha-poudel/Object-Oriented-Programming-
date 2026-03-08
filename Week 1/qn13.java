import java.util.*;
public class qn13 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of items : ");
	double quantity = sc.nextDouble();
	System.out.println("Enter the price of item : ");
	double price = sc.nextDouble();
	double  total = quantity*price;
	System.out.println("The total price is " +total );
}
}
