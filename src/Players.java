
public class Players extends Location {

	public Players(String north, String south, String east, String west) {
		super(north, south, east, west);
		// TODO Auto-generated constructor stub
	}

	int group1 = 5;
	int group2 = 2;

	public void getLocation(int group1) {
		for (int i = 0; i < 10; i++) {
			if (group1 == 5) {
				System.out.println("5 Players entered into north");
			} else if (group2 == 3) {
				System.out.println("3 players enteredfrom south");
			}

		}
	}

}
