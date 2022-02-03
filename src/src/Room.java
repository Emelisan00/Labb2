
public class Room extends Location {
	
	
	public Room(String name, String description, String shortDescription) {
		super(name, description, shortDescription);
	
	}
	
	public void doCommand(String command) {
		
	}

	public void connections() {
		
		
		if (neighbours[0] != null) {
			System.out.println("There is a door leading north.");
		}
		if (neighbours[1] != null) {
			System.out.println("There is a door leading east.");
		}
		if (neighbours[2] != null) {
			System.out.println("There is a door leading south.");
		}
		if (neighbours[3] != null) {
			System.out.println("There is a door leading west.");

		}

		
	}

}
