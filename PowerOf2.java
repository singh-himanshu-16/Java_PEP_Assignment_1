import java.util.*;
import java.lang.*;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power");
        int pow = sc.nextInt();
        System.out.println("The power of 2 at the given number is : "+Math.pow(2,pow));
        sc.close();
    }
}
