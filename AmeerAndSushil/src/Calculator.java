/**
 * Some basic operations in calculator
 * @author sushil.bahadur.karki
 *
 */
public class Calculator {

	/**
	 * Two variable function
	 */
	public int  x;
	public int y;
	
	/**
	 * Return addition of two number
	 * @param firstNumber
	 * @param secondNumber
	 * @return firstNubmer + secondNumber
	 */
	public int Addition(int firstNumber, int secondNumber){
		x = firstNumber;
		y = secondNumber;
		return x + y;
	}
	
	/**
	 * Returns subtraction between two numbers
	 * @param firstNumber
	 * @param secondNumber
	 * @return firstNumber - secondNubmer
	 */
	public int Subraction(int firstNumber, int secondNumber){
         x = firstNumber;
         y = secondNumber;
		return x - y;
	}
}
