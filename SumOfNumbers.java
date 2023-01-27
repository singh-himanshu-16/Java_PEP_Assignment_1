import java.util.*;
public class SumOfNumbers {
    public static int getTotal(int number) {
        if (number != 0) {
            return number + getTotal(number - 1);
        }
        else {
              return number;
        }
    }
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int total = getTotal(number);
        System.out.println("Sum = " + total);
        sc.close();
    }
}
