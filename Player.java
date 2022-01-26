
public class Player {
	private String name;
	private Location position;
	private int health;
	private boolean bookStolen;
	
	public Player (String name, Location position){
		this.name = name;
		this.position = position;
		health = 100;
	}
	
	public Location getLocation () {
		return this.position;
	}
	
	public void setLocation (Location location) {
		 this.position = location; 
		
	}
	
	public void describeYourself ( ) {
		
	}
	
	public void doCommand (String command) {
		
		position.doCommand(command, this);
		if (command.equals("north")) {
			Location newPositionNorth = getLocation().neighbours[1];

			newPositionNorth = getLocation().neighbours[3];

			newPositionNorth.describeYourself();

			position = newPositionNorth;

		}
		
		if (command.equals("east")) {

			Location newPositionEast = getLocation().neighbours[1];

			newPositionEast.describeYourself();

			position = newPositionEast;
		}
		
		if (command.equals("north")) {
			Location newPositionNorth = getLocation().neighbours[1];

			newPositionNorth = getLocation().neighbours[3];

			newPositionNorth.describeYourself();

			position = newPositionNorth;

		}
		
		

		if (command.equals("west")) {
			Location newPositionWest = getLocation().neighbours[1];

			newPositionWest = getLocation().neighbours[3];

			newPositionWest.describeYourself();

			position = newPositionWest;
		

		}
	}
}
