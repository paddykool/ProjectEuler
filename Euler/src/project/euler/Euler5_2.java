package project.euler;

/* 2520 is the smallest number that can be divided by each of the numbers
 * from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of
 * the numbers from 1 to 20?
 */

public class Euler5_2 {

	public static void main(String[] args) {
		
		boolean divider = true;
		
		for (int i = 1; i <= 10; i++){
			for (int j = 1; j <= 10; j++){
				int product = i*j;
				
				for (int k = j+1; k <= 10 ;k++){
					int remainder = product % k;
					if (remainder != 0){
						divider = false;
						break;
					}
				}
				
				if (divider == true)
					System.out.println("This is a number that divides by all numbers: " + product);
			}
		}
		
	}
}
