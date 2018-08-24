
public class Watch extends Location {

	public Watch(int read5, double read4, int read1, String north, String south, String east, String west) {
		super(north, south, east, west);
		// TODO Auto-generated constructor stub
	}


	private int read5;
	private double read4;
	private int read1;



	
	/**
	 * @return the read5
	 */
	public Object getRead5() {
		return read5;
	}
	/**
	 * @param read5 the read5 to set
	 */
	public void setRead5(int read5) {
		this.read5 = read5;
	}
	/**
	 * @return the read4
	 */
	public double getRead4() {
		return read4;
	}
	/**
	 * @param read4 the read4 to set
	 */
	public void setRead4(double read4) {
		this.read4 = read4;
	}
	/**
	 * @return the read1
	 */
	public int getRead1() {
		return read1;
	}
	/**
	 * @param read1 the read1 to set
	 */
	public void setRead1(int read1) {
		this.read1 = read1;
	}


	// checking the time conditions
	int a = 12;
	double b = 4.742;
	int c = 1;

	boolean checkTime = false;
	{

		if (a > 5 && checkTime) {
			System.out.println("You are in North");
		} else if (b > 4.472 && checkTime) {
			System.out.println("You are in South");
		} else if (c > 1 && checkTime) {
			System.out.println("You are in West");
		}
	}
	public static void add(Watch w1) {
		// TODO Auto-generated method stub
		
	}
}
