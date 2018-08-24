
public class Location {

	private String north;
	private String south;
	private String east;
	private String west;

	public Location(String north, String south, String east, String west) {
		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
	}

	public String getNorth() {
		return north;
	}

	public void setNorth(String north) {
		this.north = north;
	}

	public String getSouth() {
		return south;
	}

	public void setSouth(String south) {
		this.south = south;
	}

	public String getEast() {
		return east;
	}

	public void setEast(String east) {
		this.east = east;
	}

	public String getWest() {
		return west;
	}

	public void setWest(String west) {
		this.west = west;
	}

	public String toString() {// overriding the toString() method
		return north + " " + south + " " + east + " " + west;
	}

	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static Location get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getRead4() {
		// TODO Auto-generated method stub
		return 10.2;
	}

	public Object getRead5() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getRead1() {
		// TODO Auto-generated method stub
		return 2;
	}

}
