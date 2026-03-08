import java.util.*;
public class qn10 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int a = sc.nextInt();
        System.out.println("Enter a second number: ");
        int b = sc.nextInt();
        int sum = a+b;
        int diff = a-b;
        int product = a*b;
        double division = a/b;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(product);
        System.out.println(division);
        sc.close();
    }
}

