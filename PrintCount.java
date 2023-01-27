// Java program to count the digits of a number 
// using the recursion

import java.util.*;
public class PrintCount {
  static int count = 0;

  public static int countDigits(int num) {
    if (num > 0) {
      count++;
      countDigits(num / 10);
    }

    return count;
  }

  public static void main(String[] args) {
    Scanner X = new Scanner(System.in);

    int num = 0;
    int res = 0;

    System.out.printf("Enter number: ");
    num = X.nextInt();

    res = countDigits(num);
    System.out.printf("Total digits are: " + res);
  }
}
