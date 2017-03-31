import java.time.*;
import java.time.temporal.*;

public class SampleClock {

	public static void main(String[] arguments)
	{
		// Grab local time and date
		LocalDateTime now = LocalDateTime.now();

		// Display a greeting
		System.out.print("Hi there, \n" +
			DisplayGreeting(now) + "\n" +
			"The time is currently " + 
			DisplayMinute(now) + " minutes and " +
			DisplaySecond(now) + " seconds past " +
			DisplayHour(now) + " o'clock on this, the " +
			DisplayDay(now) + 
			DisplayDaySuffix(now) + " day of " +
			DisplayMonth(now) + " in " + 
			DisplayYear(now));
	}
		
	private static String DisplayGreeting(LocalDateTime now)
	{
		String greetingValue = "";
		int hour = now.get(ChronoField.HOUR_OF_DAY);
		
		if (hour != 0 && 1 <= hour && hour < 24)
		{
			if (hour < 12)
			{
				greetingValue = "Good Morning";
			}
			else if (hour < 17)
			{
				greetingValue = "Good Afternoon";
			}
			else
			{
				greetingValue = "Good Evening";
			}
		}
		
		return greetingValue;
	}
	
	private static String DisplayHour(LocalDateTime now)
	{
		String hourValue = "";
		int hour = now.get(ChronoField.HOUR_OF_DAY);
		
		if (hour != 0 && 1 <= hour && hour < 24)
		{
			int convertedHour = hour > 12 ? hour - 12 : hour;
			hourValue = String.valueOf(convertedHour);
		}
		
		return hourValue;
	}
	
	private static String DisplayMinute(LocalDateTime now)
	{
		String minuteValue = "";
		int minute = now.get(ChronoField.MINUTE_OF_HOUR);
		
		if (minute != 0 && 1 <= minute && minute < 60)
		{
			minuteValue = String.valueOf(minute);
		}
		
		return minuteValue;
			
	}
	
	private static String DisplaySecond(LocalDateTime now)
	{
		String secondValue = "";
		int second = now.get(ChronoField.SECOND_OF_MINUTE);
		
		if (second != 0 && 1 <= second && second < 60)
		{
			secondValue = String.valueOf(second);
		}
		
		return secondValue;
	}
	
	private static String DisplayDay(LocalDateTime now)
	{
		String dayValue = "";
		int day = now.get(ChronoField.DAY_OF_MONTH);
		
		if (day != 0 && 1 <= day && day <= 31)
		{
			dayValue = String.valueOf(day);
		}
		
		return dayValue;
	}
	
	private static String DisplayMonth(LocalDateTime now)
	{
		String monthValue = "";
		int month = now.get(ChronoField.MONTH_OF_YEAR);
		
		String[] months = { "January", "February", "March", "April",
							"May", "June", "July", "August",
							"September", "October", "November", "December"};
		
		if (month != 0 && 1 <= month && month <= 12)
		{
			monthValue = months[month-1];
		}
		
		return monthValue;
	}
	
	private static String DisplayYear(LocalDateTime now)
	{
		String yearValue = "";
		int year = now.get(ChronoField.YEAR);
		
		if (year != 0 && 1 <= year && year <= 2032)
		{
			yearValue = String.valueOf(year);
		}
		
		return yearValue;
	}
	
	private static String DisplayDaySuffix(LocalDateTime now)
	{
		String daySuffixValue = "";
		
		int day = now.get(ChronoField.DAY_OF_MONTH);
		
		if (day != 0 && 1 <= day && day <= 31)
		{
			switch(day % 10)
			{
				case 1 : daySuffixValue = "st"; break;
				case 2 : daySuffixValue = "nd"; break;
				case 3 : daySuffixValue = "rd"; break;
				default : daySuffixValue = "th";
			}
		}
		
		return daySuffixValue;
	}
}
