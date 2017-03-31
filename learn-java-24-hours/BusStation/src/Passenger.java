public class Passenger {

	private String nameFirst;
	private String nameMiddle;
	private String nameLast;
	
	public Passenger()
	{
		nameFirst = "";
		nameMiddle = "";
		nameLast = "";
	}
	
	public Passenger(
		String firstName,
		String middleName,
		String lastName)
	{
		nameFirst = firstName;
		nameMiddle = middleName;
		nameLast = lastName;
	}
	
	public String passengerFullName()
	{
		return nameFirst + " " + nameMiddle + " " + nameLast;
	}
}
