package project.euler;

/* The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

public class Euler3_2 {
	public static void main(String[] args) {
		// Find the prime numbers . . .
		long targetNumber = 600851475143l;
		
		for(long i = 2; i < targetNumber; i++ ){
			boolean prime = true;
			long j = i/2;
			while (j > 1) {
				if (i % j == 0) {
					prime = false;
					break;
				}
				j--;
			}
			
			// now, is this number a factor of targetNumber ??
			if (prime == true){
				
				if (targetNumber % i == 0) {
					System.out.println(i + " is a factor of " + targetNumber);
				}
				
			}
		}
	}
}
