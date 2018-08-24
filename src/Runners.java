import java.util.ArrayList;

public class Runners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Location l1 = new Location("North", "South", "East", "West");
		Attractionn a1 = new Attractionn(1, "Town", "beach");
		// Watch w1 = new Watch(0, 5.4, 0, null, null, null, null);
		Watch w1 = new Watch(10, 5.4, 0, null, null, null, null);

		ArrayList<Location> Location = new ArrayList();
		ArrayList<Attractionn> Attractionn = new ArrayList();

		// adding people to array list
		Location.add(l1);
		Attractionn.add(a1);
		Watch.add(w1);

		for (int i = 0; i < Location.size(); i++) {

			// System.out.println(Location.get(i).getNorth());
			System.out.println("Player can enter from: ");
			System.out.println(Location.get(i).getNorth() + " \n" + Location.get(i).getSouth() + " \n"
					+ Location.get(i).getEast() + " \n" + Location.get(i).getWest() + " \n");

			// System.out.println(Attractionn.get(i).getID());
			System.out.println("Attractionn of places: ");
			System.out.println(Attractionn.get(i).getID() + " \n" + Attractionn.get(i).getPlaceName() + " \n"
					+ Attractionn.get(i).getView() + " \n");

			System.out.println("Time notification: ");
			System.out.println(
					Watch.get(i).getRead5() + " \n" + (Watch.get(i)).getRead4() + " \n" + (Watch.get(i)).getRead1());
		}
	}

}
