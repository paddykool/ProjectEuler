package project.euler;

public class Euler3_4 {
	public static void main(String[] args)
	{
		//long targetNumber = 600851475143l;
		//long targetNumber = 13195;
		long targetNumber = 14;
		long [] factors = new long[2];
		long largestNumber = 0;
		
		for(long i = 2; i*i < targetNumber; i++ ){ // only loop up to the square root if the value
			// is it a factor of the target number ??
			if (targetNumber % i == 0){
				// get the 2 factors, one of which is i, the other is target number/i
				factors[0] = i;
				factors[1] = targetNumber/i;
				
				// are these prime numbers ?? - check every number below it to see if it divides 
				for(int k = 0; k < 2; k++){
					long l = 2;
					boolean prime = true;
					while (l*l < factors[k]){
						if (factors[k] % l == 0) {
							prime = false;
							break;
						}
						l++;
					}
					if (prime == true && factors[k] > largestNumber) {
						largestNumber = factors[k];
					}
				}
			}
		}
		System.out.println(largestNumber + " is the largest prime factor");
	}
}