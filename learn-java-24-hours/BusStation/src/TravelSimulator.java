public class TravelSimulator {

	public static void main(String[] args) {

		Station station;
		Bus bus;
		Passenger passenger;
		
		// Create the station first
		station = new Station("Seattle");
		
		// Create the first bus and add some passengers
		bus = new Bus(1250,10,"Seattle", "Portland");
		
		passenger = new Passenger("Grace", "Brewster Murray", "Hopper");
		bus.boardPassenger(passenger);
		passenger = new Passenger("Alan", "Mathison", "Turing");
		bus.boardPassenger(passenger);
		
		station.addBus(bus);
		
		bus = new Bus(1350,15,"Seattle", "Vancouver");
		
		passenger = new Passenger("Ada", "Augusta", "Lovelace");
		bus.boardPassenger(passenger);
		passenger = new Passenger("John", "von", "Neumann");
		bus.boardPassenger(passenger);
		
		station.addBus(bus);
		
		bus = new Bus(1450,10,"Seattle", "Los Angeles");
		
		passenger = new Passenger("Charles", "Henry", "Babbage");
		bus.boardPassenger(passenger);
		passenger = new Passenger("Steve", "Gary", "Wozniak");
		bus.boardPassenger(passenger);
		passenger = new Passenger("Edgar", "Frank", "Codd");
		bus.boardPassenger(passenger);		
		
		station.addBus(bus);
		
		// Print general welcome
		System.out.println(
			"Feico Station Management\n------------------------\n");

		// Now print out the current station information		
		System.out.print(station.stationInformation());
		System.out.print(station.busListing());
	}
}
