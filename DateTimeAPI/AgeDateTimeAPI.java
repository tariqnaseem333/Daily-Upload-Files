package thursday_16_nov;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeDateTimeAPI {

	public static void main(String[] args) {
		
//		Input:        "2/11/1991"
//		Output:        Date: 02-11-1991
//					   You are 22 years, 7 months and 11 days old.
		
//		Taking Input of the date as a String
		Scanner scanner = new Scanner(System.in);
		String inputDateString = scanner.next();
		scanner.close();
		
//		Converting from String to Date Object
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate inputDate = LocalDate.parse(inputDateString, formatter);
		
//		Converting date to Object to Date String as required in Output and displaying output
		String outputDateString = inputDate.format(DateTimeFormatter.ofPattern("d-MM-yyyy"));
		System.out.println(outputDateString);
		
//		Displaying the age from input date to today's date
		LocalDate today = LocalDate.now();
		System.out.println("You are " + today.minusYears(inputDate.getYear()).getYear() + " years, "
				+ today.minusMonths(inputDate.getMonthValue()).getMonthValue() + " months and " 
				+ today.minusDays(inputDate.getDayOfMonth()).getDayOfMonth() + " days old.");
		
		

		
	}

}
