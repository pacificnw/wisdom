import java.util.*;
import java.math.*;
import java.text.*;

public class FibonacciSequence {
	private BigInteger sequenceSummation;
	private BigInteger sequenceCount;
	private ArrayList<BigInteger> sequence;
	private BigInteger elementsRequested;
	
	public FibonacciSequence() {
		sequence = new ArrayList<BigInteger>();
		sequenceSummation = new BigInteger("0");
		sequenceCount = new BigInteger("0");
		elementsRequested = new BigInteger("0");
	}
	
	public void generateElements(BigInteger numberElements) {
		
		// Reset the sequence upon each subsequent call
		sequence = new ArrayList<BigInteger>();
		sequenceSummation = new BigInteger("0");
		sequenceCount = new BigInteger("0");
		elementsRequested = numberElements;
		
		generateSequence(new BigInteger("0"), new BigInteger("0"));
	}
	
	private void generateSequence(BigInteger ithNumber, BigInteger jthNumber) {
		
		BigInteger newValue;
		
		if (elementsRequested.compareTo(new BigInteger("0")) == 0) {
			return;
		} else if (ithNumber.compareTo(new BigInteger("0")) == 0 || jthNumber.compareTo(new BigInteger("0")) == 0) {
			newValue = new BigInteger("1");
			sequenceSummation = sequenceSummation.add(new BigInteger("1"));
			
			sequence.add(newValue);	
			sequenceCount = sequenceCount.add(new BigInteger("1"));
			
			if (sequenceCount.compareTo(elementsRequested) < 0) {
				generateSequence(jthNumber, newValue);
			}				
		} else {
			newValue = ithNumber.add(jthNumber);
			sequenceSummation = sequenceSummation.add(newValue);
			
			sequence.add(newValue);	
			sequenceCount = sequenceCount.add(new BigInteger("1"));
			
			if (sequenceCount.compareTo(elementsRequested) < 0) {
				generateSequence(jthNumber, newValue);
			}				
		}
	}
	
	public void displaySequence() {
		
		for (BigInteger bigInteger : sequence) {
			if (withCommas(bigInteger).length() < 80) {
				System.out.print(" " + withCommas(bigInteger));
			} else {
				System.out.print("\n" + multiLine(withCommas(bigInteger), 80));
			}
		}
		System.out.print("\n");
	}
	
	public void displaySequenceCount() {
		System.out.println("Sequence count : " + withCommas(sequenceCount));
	}
	
	public void displaySequenceSum() {
		System.out.println("Sequence summation : " + withCommas(sequenceSummation));
	}
	
	public static String withCommas(BigInteger item) {
		return NumberFormat.getNumberInstance(Locale.US).format(item);
	}
	
	public static String multiLine(String outputNumber, int outputLengthLimit) {
		
		String multilineString = "";
		int startIndex = 0;
		int endIndex = outputNumber.length();
		int lengthLimit = outputLengthLimit;		

	    while (endIndex > startIndex) {
	    	
	    	if (endIndex - lengthLimit > startIndex) {
	    		multilineString = outputNumber.substring(endIndex - (lengthLimit), endIndex) + "\n" + multilineString;
	    		endIndex -= lengthLimit;
	    	} else {
	    		multilineString = outputNumber.substring(startIndex, endIndex) + "\n" + multilineString;
	    		endIndex = startIndex;
	    	}
	    }
	    
	    return multilineString;
	}
}