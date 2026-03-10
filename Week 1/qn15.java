
import java.util.*;
public class qn15 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a first number: ");
    int num1 = sc.nextInt();
    System.out.println("Enter a second number: ");
    int num2 = sc.nextInt();
    int sum = num1+ num2;
    int diff = num1-num2;
    int product = num1*num2;
    int quotient = num1/num2;
    System.out.println("The sum of num1 and num2 is " + sum);
    System.out.println("The difference of num1 and num2 is " + diff);
    System.out.println("The product of num1 and num2 is " + product);
    System.out.println("The quotient of num1 and num2 is " + quotient);
    sc.close();
    
    }
}
