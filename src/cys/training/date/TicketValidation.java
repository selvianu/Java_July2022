package cys.training.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TicketValidation {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Source and destination");
		String source = s.nextLine();
		String destination = s.nextLine();
		System.out.println("Enter travel date");
		String travelTime = s.next();
		LocalDate travelDate = LocalDate.parse(travelTime);
		LocalDate today = LocalDate.now();
		boolean after = travelDate.isAfter(today);//
		System.out.println(after);
		boolean equals = travelDate.equals(today);
		System.out.println(equals);
		if (after) {
			LocalDate newDate = travelDate.plusDays(5);
			System.out.println(newDate);
		} else
			System.out.println("invalid Date");

	}

}
