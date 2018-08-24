import java.util.Scanner;

public class Playthrough {

	private static String grey;
	private static String foggy;
	private static String clouds;
	private static String floats;
	private String location;

	public Playthrough(String grey, String foggy, String clouds, String floats, String location) {
		this.grey = grey;
		this.foggy = foggy;
		this.clouds = clouds;
		this.floats = floats;
		this.location = location;
	}

	public String getGrey() {
		return grey;
	}

	public void setGrey(String grey) {
		this.grey = grey;
	}

	public String getFoggy() {
		return foggy;
	}

	public void setFoggy(String foggy) {
		this.foggy = foggy;
	}

	public String getClouds() {
		return clouds;
	}

	public void setClouds(String clouds) {
		this.clouds = clouds;
	}

	public String getFloats() {
		return floats;
	}

	public void setFloats(String floats) {
		this.floats = floats;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String toString() {// overriding the toString() method
		return grey + " " + foggy + " " + clouds + " " + floats;
	}

	public String getLocation() {
		if (location.equals(grey))
			return this.grey = grey;
		else if (location.equals(foggy))
			return this.foggy = foggy;
		else if (location.equals(clouds))
			return this.clouds = clouds;
		else if (location.equals(floats))
			return this.floats = floats;
		return "";
	}

	// scanner method

	/*
	 * public static void main(String[] args) {
	 * 
	 * // object of an scanner Scanner s = new Scanner(System.in);
	 * System.out.println("Where would you like to enter from?");
	 * System.out.println("Enter from :" + grey);
	 * 
	 * String grey = s.nextLine(); System.out.println("This is Grey enterance");
	 * 
	 * String name = s.nextLine(); System.out.println("Who is next to buy");
	 * 
	 * }
	 */

	public static class ScannerTest {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			String grey = sc.nextLine();
			String foggy = sc.nextLine();
			String clouds = sc.nextLine();
			String floats = sc.nextLine();

			// Print the values to check if input was correctly obtained.
			System.out.println("grey: " + grey);
			System.out.println("foggy: " + foggy);
			System.out.println("clouds: " + clouds);
			System.out.println("floats: " + floats);
		}
	}
}