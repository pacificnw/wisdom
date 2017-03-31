import java.util.*;

public class Station {

	private String stationName;
	private ArrayList<Bus> buses;

	public Station()
	{
		stationName = "";
		buses = new ArrayList<Bus>();
	}
	
	public Station(String name)
	{
		stationName = name;
		buses = new ArrayList<Bus>();
	}
	
	public String stationInformation()
	{
		String stationInfo;
		
		stationInfo = "[Station : " + stationName + "]\n";
				
		return stationInfo;
	}
	
	public void addBus(Bus bus)
	{
		if (bus != null)
		{
			buses.add(bus);
		}
	}
	
	public String busListing()
	{
		String busList = "";
		
		for (Bus bus : buses)
		{
			busList += bus.displayBusInformation() + "\n";
			busList += bus.displayPassengerList() + "\n";
		}
		
		return busList;
	}
}
