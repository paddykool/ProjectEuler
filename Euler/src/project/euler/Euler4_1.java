package project.euler;

/* A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Euler4_1 {

	public static void main(String[] args) {
		
		int largest = 0;
		
		for(int i = 10; i < 1000; i++){
			for(int j = 10; j < 1000; j++){
				int number = i*j;
				// is number a palindrom ??
				// reverse it then see if it equals the original number
				int reverse = 0;
				int numberTemp = number;
				while (numberTemp != 0){
					reverse = reverse * 10;
					reverse = reverse + numberTemp % 10;
					numberTemp = numberTemp / 10;
				}
				if(number == reverse){
					System.out.println("This number is a palindrom: " + number);
					if (largest < number )
						largest = number;
				}
			}
		}
		System.out.println("This is the largest palindrom: " + largest);
	}

}