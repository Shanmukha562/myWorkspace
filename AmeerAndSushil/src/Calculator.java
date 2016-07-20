/**
 * Some basic operations in calculator
 * 
 * @author sushil.bahadur.karki
 *
 */

public class Calculator {


	
/**
	 * Two variable function
	 */
	public int firstNumber;
	public int secondNumber;

	public static void main(String[] args) {
		System.out.println("Addition is " + Addition(10, 5));
		System.out.println("Subraction is " + Subraction(10, 5));

	}

	/**
	 * Return addition of two number
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return firstNubmer + secondNumber
	 */
	public static int Addition(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	/**
	 * Returns subtraction between two numbers
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return firstNumber - secondNubmer
	 */
	public static int Subraction(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}
	
}
