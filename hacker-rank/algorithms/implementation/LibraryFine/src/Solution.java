import java.io.*;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        BookCheckin actualCheckin = new BookCheckin(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        BookCheckin expectedCheckin = new BookCheckin(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        scanner.close();
        
        actualCheckin.ExpectedCheckin(expectedCheckin);
        
        System.out.println(actualCheckin.feeDue());
    }
}

class BookCheckin {

    private int actualDay;
    private int actualMonth;
    private int actualYear;

    private int expectedDay;
    private int expectedMonth;
    private int expectedYear;

    public BookCheckin(int day, int month, int year) {
        actualDay = day;
        actualMonth = month;
        actualYear = year;
    }

    public void ExpectedCheckin(BookCheckin bookCheckin) {
        expectedDay = bookCheckin.actualDay;
        expectedMonth = bookCheckin.actualMonth;
        expectedYear = bookCheckin.actualYear;
    }

    private BookCheckin dateDifference() {
        LocalDate actual = 
            LocalDate.parse(
                String.format("%04d", this.actualYear) + "-" + 
                String.format("%02d", this.actualMonth) + "-" + 
                String.format("%02d", this.actualDay));
        
        LocalDate expected = 
            LocalDate.parse(
                String.format("%04d", this.expectedYear) + "-" + 
                String.format("%02d", this.expectedMonth) + "-" + 
                String.format("%02d", this.expectedDay));
		
		BookCheckin componentDifference = 
            new BookCheckin(
                (int)ChronoUnit.DAYS.between(expected, actual),
                (int)ChronoUnit.MONTHS.between(expected, actual),
                (int)ChronoUnit.YEARS.between(expected, actual));
        
        return componentDifference;
    }
    
    public int feeDue() {
        int lateFee = 0;
        
        BookCheckin difference = this.dateDifference();
        
        if (difference.actualDay <= 0 && difference.actualMonth <= 0 && difference.actualYear <= 0) {
            lateFee = 0;
        } else {
            if (actualDay > expectedDay && actualMonth == expectedMonth && actualYear == expectedYear) {
                lateFee = 15 * Math.abs(expectedDay - actualDay);
            } else {
                if (actualMonth > expectedMonth && actualYear == expectedYear) {
                    lateFee = 500 * Math.abs(expectedMonth - actualMonth);
                } else {
                    if (actualYear > expectedYear) {
                        lateFee = 10_000;
                    }
                }
            }
        }
        
        return lateFee;
    }
}
