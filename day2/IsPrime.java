package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
        int number = 13; 
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } 
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }
    }
}
