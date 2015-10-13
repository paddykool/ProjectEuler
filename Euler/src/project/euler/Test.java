package project.euler;

public class Test {

	public static void main(String[] args) {
		
		// reverse a number . . . 
		int number = 123;
		int reverse = 0;
		while (number != 0){
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		System.out.println("the of the number is: " + reverse);
	}
}
