package project.euler;

import java.util.Arrays;
import java.util.ArrayList;
import java.math.BigInteger;

/* The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

public class Euler3_1 {

	public static void main (String... args){
		

		//BigInteger getFactorOf = BigInteger.valueOf(600851475143l);
		BigInteger getFactorOf = BigInteger.valueOf(100000l);
		//BigInteger getFactorOf = BigInteger.valueOf(13195l);
		
		// Get all the prime numbers up to a specified value
		ArrayList<BigInteger> primeNumbers = GetPrimeNumbers(getFactorOf);
		
		for (BigInteger i : primeNumbers)
			System.out.println(i + " is a prime number");
		
		// Get the prime factors of a specified number
		/*for (long i : primeNumbers){
			//long j = i;
			if (getFactorOf % i == 0){
				System.out.println( i + " is a prime factor of " + getFactorOf);
			}
		}
		*/
	}
	
	static ArrayList<BigInteger> GetPrimeNumbers(BigInteger primeNumbersUpTo){
		ArrayList<BigInteger> primeNumbers = new ArrayList<BigInteger>();
		boolean prime = true;
		long longPrimeNumbersUpTo = primeNumbersUpTo.longValue();
		for(long i = 2; i < longPrimeNumbersUpTo; i++ ){
			prime = true;
			long j = i/2;
			while (j > 1) {
				if (i % j == 0) {
					prime = false;
					break;
				}
				j--;
			}
			
			if (prime == true){
				//System.out.println(i + " is a prime number");
				BigInteger k = BigInteger.valueOf(i);
				primeNumbers.add(k);
			}
		}
		
		return primeNumbers;
	}
}