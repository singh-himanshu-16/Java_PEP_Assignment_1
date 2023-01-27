import java.util.*;
public class Fibonacci_Term{
	public static int fibonacciRecursion(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term");
	    int term = sc.nextInt();
    	System.out.print("The "+term+"th term in Fibonacci Series is: ");
			System.out.print(fibonacciRecursion(term));
	}
}