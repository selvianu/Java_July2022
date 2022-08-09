package cys.training.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeDateExample {
	public static String employerName = "Chainsys-Chennai";
	public static Date joiningDate = new Date();// displays current date

	public static void getDateOfBirth() throws ParseException {
		String sDate1 = "31/12/1998";
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		System.out.println(sDate1 + "\t" + date1);
		
	}
	public static void display()
	{
		
	}

	public static void main(String[] args) throws ParseException {
		System.out.println(employerName + ":" + joiningDate);
		getDateOfBirth();

	}
}
