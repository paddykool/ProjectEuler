package project.euler;

/* n=”the evil big number”
 * factor=2
 * lastFactor=1
 * while n>1
 * 	if n mod factor=0
 * 	then
 * 		lastFactor=factor
 * 		n=n div factor
 * 		while n mod factor=0
 * 			n=n div factor
 * 			factor=factor+1
 * output lastFactor
 */

public class Euler3_3 {
	public static void main(String[] args) {
		
		long n = 13195;
		//long n = 600851475143l;
		long factor = 2;
		long lastFactor = 1;
		while (n > 1){
			if (n % factor == 0){
				lastFactor = factor;
				n = n/factor;		// what the hell is happening here ??
				while (n % factor == 0){
					n = n/factor;
				}
			}
			factor = factor + 1;
		}
		System.out.println(lastFactor);
		
	}
}