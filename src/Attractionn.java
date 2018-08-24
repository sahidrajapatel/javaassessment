
public class Attractionn {

	private int ID;
	private String placeName;
	private String view;

	Attractionn(int ID, String placeName, String view) {

		this.ID = ID;
		this.placeName = placeName;
		this.view = view;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the placeName
	 */
	public String getPlaceName() {
		return placeName;
	}

	/**
	 * @param placeName the placeName to set
	 */
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	/**
	 * @return the view
	 */
	public String getView() {
		return view;
	}

	/**
	 * @param view the view to set
	 */
	public void setView(String view) {
		this.view = view;
	}

	public String toString() {// overriding the toString() method
		return ID + " " + placeName + " " + view;
	}

}