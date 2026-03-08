import java.util.Scanner;

public class qn11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in miles: ");
        double miles = sc.nextDouble();
        double kilometers = miles * 1.60934;
        System.out.println("Distance in kilometers: " + kilometers);
        sc.close();
    }
}

