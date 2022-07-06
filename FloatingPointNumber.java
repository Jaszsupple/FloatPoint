import java.util.Scanner;
public class FloatingPointNumber {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter a Number");
		
		Float number = keyboard.nextFloat();
		
		if (number > 1000000) {
			System.out.println("Positive and Large ");
					
		} else {
			if ((number > 0) && (number < 1)) {
			System.out.println("Positive and Small");
			}
			else {
				if (number > 0) {
					System.out.println("Positive");
				}
			}
		}
		
		if (number < 0) {
			System.out.println("Negative and Small");
		}  
		
		if (number == 0) {
			System.out.println("zero and small");
		}

		keyboard.close();		

	}

}
