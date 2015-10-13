package project.euler;

/* A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Euler4_2 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		int largest = 0;
		for(int i = 10; i < 1000; i++){
			for(int j = i; j < 1000; j++){
				int number = i*j;
				// is number a palindrom ??
				int reverse = reverseNumber(number);
				if(number == reverse && largest < number){
					largest = number;
				}
			}
		}
		System.out.println("This is the largest palindrom: " + largest);
		long endTime = System.currentTimeMillis();
		System.out.println("Tolal time = " + (endTime - startTime));
	}
	
	static int reverseNumber(int number){
		int reverse = 0;
		while (number != 0){
			reverse = reverse * 10;
			reverse = reverse + (number % 10);
			number = number / 10;
		}
		return reverse;
	}
}