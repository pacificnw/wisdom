
public class SystemPerformance {

	// Check the System performance
	public static void main(String[] arguments)
	{

		long startTime = System.currentTimeMillis();
		long endTime = startTime + 5000;
		long index = 0;
		
		// Record number of computations of square root of index value over 5 secs
		while(true)
		{
			double x = Math.sqrt(index);
			long now = System.currentTimeMillis();
			
			if (now > endTime)
			{
				break;
			}
			
			index++;
		}
		
		System.out.println("Your machine performed " + index + " calculations in 5 seconds");
	}
	
}
