package thursday_16_nov;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BoardTrainDateTimeAPI {

	public static void main(String[] args) {

		/*

Exercise :- 
			Thomas has to board train departing at 8:00 PM, You have to check whether he will be able to board or not.
			It takes him 2.5 hrs to reach the station and further 15 mins to reach the platform.
			Before what time should he leave his house in order to board the train ?
			(Hint :- You can use isAfter() and isBefore() methods, take reference from LocalDate tryout)

		 */

		LocalTime trainTiming = LocalTime.of(8, 00);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the hour at which Thomas will left the House: ");
		int hour = scanner.nextInt();
		System.out.println("Enter the minute at which Thomas will left the House: ");
		int minute = scanner.nextInt();
		scanner.close();
		LocalTime thomasLeftHouseTime = LocalTime.of(hour, minute);

		LocalTime thomasShouldLeftHouseTime = trainTiming.minusHours(2).minusMinutes(45);

		if( thomasLeftHouseTime.isBefore(thomasShouldLeftHouseTime) || thomasLeftHouseTime.equals(thomasShouldLeftHouseTime)) {
			System.out.println("Thomas should be able to board the train");
		} else {
			System.out.println("Thomas should not be able to board the train");
			System.out.println("He should have left the House at: " + thomasShouldLeftHouseTime);
		}
		

	}

}
