import java.util.Scanner;

public class qn14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in US dollars: ");
        double dollars = sc.nextDouble();

        System.out.print("Enter the exchange rate : ");
        double rate = sc.nextDouble();

        double convertedAmount = dollars * rate;

        System.out.println("Converted amount in rupees: " + convertedAmount);

        sc.close();
    }
}

