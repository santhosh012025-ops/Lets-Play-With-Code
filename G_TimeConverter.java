package codes.basics.java;

public class G_TimeConverter {
	public static void main(String[] args) {
		System.out.println("Hours to minutes: " + convertHourToMinutes(5));
		System.out.println("Days to minutes: " + convertDaysToMinutes(10));

	}

	private static int convertDaysToMinutes(int days) {
		return days * 24 * 60;

	}

	private static int convertHourToMinutes(int hour) {

		if (hour < 0)
			return -1;

		return hour * 60;

	}

}
