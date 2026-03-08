import java.util.Scanner;

public class qn6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of length: ");
		double l = sc.nextDouble();
		double area = l*l;
		System.out.println("The area of square is " +area);
		sc.close();
		
}
}