import java.math.*;

public class Solution {

	public static void main(String[] arguments) {
		
		FibonacciSequence sequence = new FibonacciSequence();
		
		sequence.generateElements(new BigInteger("0"));
		sequence.displaySequenceCount();
		sequence.displaySequenceSum();
		sequence.displaySequence();
		System.out.println("---------------");
		sequence.generateElements(new BigInteger("1"));
		sequence.displaySequenceCount();
		sequence.displaySequenceSum();
		sequence.displaySequence();
		System.out.println("---------------");		
		sequence.generateElements(new BigInteger("2"));
		sequence.displaySequenceCount();
		sequence.displaySequenceSum();
		sequence.displaySequence();
		System.out.println("---------------");
		sequence.generateElements(new BigInteger("3"));
		sequence.displaySequenceCount();
		sequence.displaySequenceSum();
		sequence.displaySequence();
		System.out.println("---------------");
		sequence.generateElements(new BigInteger("5"));
		sequence.displaySequenceCount();
		sequence.displaySequenceSum();
		sequence.displaySequence();
		System.out.println("---------------");
		sequence.generateElements(new BigInteger("10"));
		sequence.displaySequenceCount();
		sequence.displaySequenceSum();
		sequence.displaySequence();
		System.out.println("---------------");
		sequence.generateElements(new BigInteger("47"));
		sequence.displaySequenceCount();
		sequence.displaySequenceSum();
		sequence.displaySequence();
		System.out.println("---------------");
		sequence.generateElements(new BigInteger("147"));
		sequence.displaySequenceCount();
		sequence.displaySequenceSum();
		sequence.displaySequence();		

		System.out.println("---------------");
		sequence.generateElements(new BigInteger("1000"));
		sequence.displaySequenceCount();
		sequence.displaySequenceSum();
		sequence.displaySequence();		
	}
}