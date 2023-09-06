import java.time.LocalDate;

/**
 * @author Braden Howard
 * <p> The EventSchedule class is used to print out different Event Schedules consisting of the day, month and year using constructor chaining.</p>
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
public class EventSchedule {
	// Initializing LocalDate [2].(see references at bottom of code)
	static LocalDate currentDate = LocalDate.now();
	// Declarations
	private int year;
	private int month;
	private int day;
	
	/**
	 * The default constructor sets year, month, day to the current date.
	 */
	public EventSchedule() {
		this(currentDate.getYear());// Puts current year in constructor[2]
		System.out.println("EventSchedule() was called");
	}
	
    /**
     * This constructor sets the year as passed, month to current month,
	 * and day to current day.
     * @param year the year of the EventSchedule
     */
	public EventSchedule(int year) {
		this(year, currentDate.getMonthValue());// Puts year passed from main method, and current month in constructor[2]
		System.out.println("EventSchedule(int) was called");
	}
    /**
     * This constructor sets the year as passed, month as passed,
     * and day to current day.
     * @param year the year of the EventSchedule
     * @param month the month of the EventSchedule
     */
	public EventSchedule(int year, int month) {
		this(year, month, currentDate.getDayOfMonth());// Puts year and month passed from main method, and current day in constructor[2]
		System.out.println("EventSchedule(int, int) was called");
	}

	/**
	 * This constructor sets the year as passed, month as passed, and
	 * day as passed.
	 * @param year the year of this EventSchedule
	 * @param month the month of this EventSchedule
	 * @param day the day of this EventSchedule
	 */
	public EventSchedule(int year, int month, int day) {// Puts year, month and day passed from main method in constructor
		this.year = year;
		this.month = month;
		this.day = day;
		System.out.println("EventSchedule(int, int, int) was called");
	}
	
    /**
 	 * Returns the year for this EventSchedule
 	 * @return the year for this EventSchedule
 	 */
	public int getYear() {// Gets year
		return year;
	}
    /**
     * Sets the year for this EventSchedule
     * @param year the year for this EventSchedule 
     */
	public void setyear(int year) {// Sets year
		this.year = year;
	}
    /**
 	 * Returns the month for this EventSchedule
 	 * @return the month for this EventSchedule
     */
	public int getMonth() {// Gets month
		return month;
	}

	/**
	 * Sets the month for this EventSchedule
	 * @param month the month for this EventSchedule
	 */
	public void setMonth(int month) {// Sets month
		this.month = month;
	}
	
	/**
	 * Returns the day for this EventSchedule
	 * @return the day for this EventSchedule
	 */
	public double getday() {// Gets day
		return day;
	}
	/**
	 * Sets the day for this EventSchedule
	 * @param day the day for this EventSchedule
	 */
	public void setday(int day) {// Sets day
		this.day = day;
	}
	/**
	 * Creates a report of the EventSchedule details.
	 * @return A formatted String with details of the EventSchedule
	 */
	public String createReport() {
		// Returns String formatted to print out EventSchedule: the Year, Month and Day in that order
		return String.format("EventSchedule, " + "year: %d, Month: %d, Day: %d%n",year,month,day);
	}
}
/*
 * References:
 * Referenced Oracle.com to find out the max year LocalDate could go to for my exceptions in the javadoc comments.
 * [1] Class LocalDate. Orcale.com 
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/LocalDate.html#getYear() (accessed Jun. 4, 2023). 
 * 
 * Referenced code to get current day, month, and year from user "KayV" on stackoverflow.com.
 * [2] Get integer value of the current year in Java. StackOverflow.com.
 * https://stackoverflow.com/questions/136419/get-integer-value-of-the-current-year-in-java (accessed Jun. 4, 2023). 
 */
