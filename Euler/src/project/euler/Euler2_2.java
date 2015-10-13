package project.euler;

public class Euler2_2 {
	public static void main(String... args){
		
		int lastNumber = 1;
		int currentNumber = 2;
		int evenSum = 0;
		int temp;
		
		while (currentNumber < 4_000_000) {
			System.out.println("Current number = " + currentNumber);
			System.out.println("Last number = " + lastNumber);
			if (currentNumber % 2 == 0)
				evenSum += currentNumber;
			temp = currentNumber;
			currentNumber += lastNumber;
			lastNumber = temp;
		}
		
		// answer = 4613732
		System.out.println("Sum of even numbers = " + evenSum);
	}
}
