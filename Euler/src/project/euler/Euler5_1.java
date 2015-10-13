package project.euler;

 /* 2520 is the smallest number that can be divided by each of the numbers
  * from 1 to 10 without any remainder.
  * What is the smallest positive number that is evenly divisible by all of
  * the numbers from 1 to 20?
  */

public class Euler5_1 {
	
	public static void main(String[] args){
		
		boolean divides = true;
		
		for (int i = 1; i < 1000000000; i++){
			for (int j = 1; j <=20; j++){
				divides = true;
				int remainder = i % j;
				if (remainder != 0){
					divides = false;
					break;
				}
			}
			if(divides == true)
				System.out.println("This is a number that divides by 1-10 evenly: " + i);
		}
	}
}