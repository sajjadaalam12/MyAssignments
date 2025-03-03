package week1.day2;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int range = scanner.nextInt();
		scanner.close();
     
		int first = 0, second = 1;
     
		System.out.print("Fibonacci Series: " + first + ", " + second);
     
		int next = first + second;
		while (next <= range) {
			System.out.print(", " + next);
			first = second;
			second = next;
			next = first + second;
		}
	}
}

