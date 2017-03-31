
public class StringExample {

	public static void main(String[] arguments)
	{
		// Let's start with some characters and Strings
		char singleCharacter = '#';
		char emailAtSymbol = '@';
		
		String fullName = "Matthew J. Feist";
		String firstName = "Matthew";
		String middleName = "Joel";
		String lastName = "Feist";
		
		System.out.println("This is a single character : " + singleCharacter);
		System.out.println("This is my email address : matthew.feist" + emailAtSymbol + "gmail.com");
		System.out.println("This is my full name : " + fullName);
	
		// Let's add some other types
		
		int smallNumber = 255;
		long biggerNumber = 4255922;
		double piValue = 3.1459;
		
		System.out.println("The maximum value of 8-bits : " + smallNumber);
		System.out.println("A big value stored in a long variable : " + biggerNumber);
		System.out.println("The value of pi with 4 decimals : " + piValue);
		
		System.out.println("Are these two strings the same? : " + fullName + " : " + firstName + " : " + fullName.equals(firstName));
		System.out.println("My full name in all upper case : " + fullName.toUpperCase());
		System.out.println("My full name in all lower case : " + fullName.toLowerCase());
		
		System.out.println("Does " + fullName + " contain " + middleName + " : " + fullName.contains(middleName));
		System.out.println("Does " + fullName + " contain " + lastName + " : " + fullName.contains(lastName));
		
		System.out.println("My name " + fullName + " is " + fullName.length() + " characters long");
	}
	
}
