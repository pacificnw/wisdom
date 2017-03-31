import java.util.*;

public class Bus {

	private int busNumber;
	private int passengerCapacity;
	private String origLocation;
	private String destLocation;
	
	private ArrayList<Passenger> passengers;
	
	public Bus()
	{
		busNumber = 0;
		passengerCapacity = 0;
		origLocation = "";
		destLocation = "";
		passengers = new ArrayList<Passenger>();
	}
	
	public Bus(
		int busIdentifier,
		int busSeats,
		String originationCity,
		String destinationCity)
	{
		busNumber = busIdentifier;
		passengerCapacity = busSeats;
		origLocation = originationCity;
		destLocation = destinationCity;
		passengers = new ArrayList<Passenger>();
	}
	
	public String displayBusInformation()
	{
		return
			"[Bus : " + busNumber + "] || [" +
			"Capacity : " + passengerCapacity + "] || [" +
			"Boarded : " + passengers.size() + "] || [" +
			"Origination : " + origLocation + "] || [" +
			"Destination : " + destLocation + "]";
	}
			
	public String displayPassengerList()
	{
		String passengerList = "";
		
		for (Passenger passenger : passengers)
		{
			passengerList += passenger.passengerFullName() + "\n";
		}
		
		return passengerList;
	}
	
	public void boardPassenger(Passenger passenger)
	{
		if (passenger != null)
		{
			passengers.add(passenger);
		}
	}
	
}
