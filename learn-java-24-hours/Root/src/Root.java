
public class Root {

	// Calculate the square root of a number and output it to the screen
	public static void main(String[] args) {
		
		int number = 255;
		double squareRoot = CalculateSquareRoot(number);
		System.out.println("The square root of the number is : " + squareRoot);
	}

	public static double CalculateSquareRoot(int number)
	{
		double squareRoot;
		
		squareRoot = Math.sqrt(number);
		
		return squareRoot;
	}
}
