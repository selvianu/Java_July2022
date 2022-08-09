package cys.training.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateFormat {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String format = datetimeformat.format(today);
		System.out.println(format);

		String dob="19-09-1976";
		LocalDate dobDate = LocalDate.parse(dob, datetimeformat);
		System.out.println(dobDate);
		
	}

}
