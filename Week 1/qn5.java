import java.util.Scanner;

public class qn5 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of length: ");
			double l = sc.nextDouble();
			System.out.println("Enter the value of breadth: ");
			double b = sc.nextDouble();
			double perimeter = 2*(l+b);
			System.out.println("The perimeter of rectangle is " +perimeter);
			sc.close();
			
}
}
