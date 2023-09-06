/**
 * @author Braden Howard
 * <p> This class calls methods from the EventSchedule class, and prints the schedule names. </p>
 * <p>Purpose: To call the methods from EventSchedule.</p>
 *
 * <p> It will print the current date for specific EventSchedules when ran, and it accounts for leap years.</p>
 * 
 * <p> Exceptions:</p>
 * <p> A programmer could manually put in dates to pass in on main method side and the program will not validate to see if they are real dates.</p>
 * <p> Program runs off of local time zones, will not give correct results for all parts of the world.</p>
 * <p> If the current date goes past '+999999999-12-31' the program will crash because that is the LocalDate max[1]. </p>
 * <p> Programmer must input dates in Year, Month, Day format, or else they will get mismatched outputs.</p>
 * <p> Program will crash if programmer passes anything but an int to the parameter </p>
 */
public class TestDemo {

	/**
	 * This is the entry point for the program, it calls methods from the EventSchedule class to make
	 * 4 different EventSchedules.
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		
		System.out.println("Just creating 4 EventSchedules" + "\n");
		
		System.out.println("EventSchedule1");
		// Prints report for Event Schedule 1
		System.out.println(new EventSchedule().createReport() + "\n");
		
		System.out.println("EventSchedule2");
		// Prints report for Event Schedule 2
		System.out.println(new EventSchedule(2022).createReport() + "\n");// format (year)
		
		System.out.println("EventSchedule3");
		// Prints Report for Event Schedule 3
		System.out.println(new EventSchedule(2022, 1).createReport() + "\n");// format (year, month)
		
		System.out.println("EventSchedule4");
		// Prints report for Event Schedule 4
		System.out.println(new EventSchedule(2022, 1, 1).createReport() + "\n");// format (year, month, day)

	}

}
