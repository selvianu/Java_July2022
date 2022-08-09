package cys.training.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeStampFormat {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String format = datetimeformat.format(today);
		System.out.println(format);

		String tnxDate="19-09-1984 09:30:30";
		LocalDateTime dobDate = LocalDateTime.parse(tnxDate, datetimeformat);
		System.out.println(dobDate);

	}

}
