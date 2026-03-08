import java.util.*;
public class qn7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of celsius: ");
        double celsius= sc.nextDouble();
         Double Fahrenheit = (9/5) * celsius+32;
         System.out.println("The same temperature in farenhiet is " + Fahrenheit);
sc.close();
    }
}
