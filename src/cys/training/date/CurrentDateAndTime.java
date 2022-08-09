package cys.training.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CurrentDateAndTime {

	public static void main(String[] args) {

		Date currentDate = new Date();
		System.out.println("prints date and time" + currentDate);// prints date and time
		LocalDate lDate = LocalDate.now();
		System.out.println("Date" + lDate); // prints the date

		LocalTime lTime = LocalTime.now();
		System.out.println("Only time : "+lTime); // prints the current time only. No date, no time-zone

		LocalDateTime lDateTime = LocalDateTime.now();
		System.out.println(lDateTime); // prints date and time but no timezone

		ZonedDateTime zDateTime = ZonedDateTime.now();
		System.out.println("ZonedDateTime"+zDateTime); // prints date time and time zone.
//month always MM in the format yyyy-MM-dd
		LocalDate date1 = LocalDate.of(2002, Month.FEBRUARY, 01);
		System.out.println(date1); // prints 2002-02-01

		LocalDate date2 = LocalDate.of(2015, Month.FEBRUARY, 32); // throws exception because the day is invalid
		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		System.out.println(previousMonthSameDay);

	}

}
