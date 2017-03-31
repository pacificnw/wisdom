import java.util.*;

public class Dice {

	public static void main(String[] args)
	{
		Random generator = new Random();
		
		int number = generator.nextInt();
		System.out.println(number);
	}
}
