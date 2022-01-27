import java.util.ArrayList;


public  class Location {
 private String name;
 private String description;
 private String shortDescription;
 private Location neighbourWest;
 private Location neighbourEast;
 Location[] neighbours = new Location[4];
 private boolean beenHereBefore = false;

 
 public Location(String name, String description, String shortDescription) {
	this.name = name;
	this.description = description;
	this.shortDescription = shortDescription;
	 
 }
 
 public void setNeighbour(Location north, Location east, Location south, Location west) {
	neighbours[0] = north;
	neighbours[1] = east;
	neighbours[2] = south;
	neighbours[3] = west;
	 
 }
 
 public String getName(){
	 return name;
 }
 
 public NPC getNPC() {
	 return null;
 }
 public String getDescription () {
	 return description;
 }
 
 public String getShortDescription () {
	 return shortDescription;
 }
 
 
 public void describeYourself () {
		System.out.println(getDescription());
	}
 
 public void shortDescribeYourself() {
	 System.out.println(getShortDescription());
	 
 }
 
 public void setBeenHereBefore(Boolean beenHereBefore) {
	 this.beenHereBefore = beenHereBefore;
 }
 
 public void fixPath(String command, Player player) {

		if (command.equals("north")) {
			Location newPositionNorth = neighbours[0];

			if (newPositionNorth != null) {
			if (beenHereBefore == false ){
				newPositionNorth.describeYourself();
				
				newPositionNorth.setBeenHereBefore(true);
				
				} else {
					newPositionNorth.shortDescribeYourself();
				}
				
				player.setLocation(newPositionNorth);

			} else {
				System.out.println("There is no way here so you stay at your current position.");
			}
		}

		

		if (command.equals("east")) {

			Location newPositionEast = neighbours[1];

			if (newPositionEast != null) {
				if (beenHereBefore == false ){
					newPositionEast.describeYourself();
					
					newPositionEast.setBeenHereBefore(true);
					
					} else {
						newPositionEast.shortDescribeYourself();
					}
			
				player.setLocation(newPositionEast);
			} else {
				System.out.println("There is no way here so you stay at your current position.");
			}

		}

		if (command.equals("south")) {
			Location newPositionSouth = neighbours[2];
			if (newPositionSouth != null) {	if (beenHereBefore == false ){
				newPositionSouth.describeYourself();
				
				newPositionSouth.setBeenHereBefore(true);
				
				} else {
					newPositionSouth.shortDescribeYourself();
				}
		

				player.setLocation(newPositionSouth);
			} else {
				System.out.println("There is no way here so you stay at your current position.");
			}

		}

		if (command.equals("west")) {
			Location newPositionWest = neighbours[3];
			if (newPositionWest != null) {
				if (beenHereBefore == false ){
					newPositionWest.describeYourself();
					
					newPositionWest.setBeenHereBefore(true);
					
					} else {
						newPositionWest.shortDescribeYourself();
					}
			
				player.setLocation(newPositionWest);
			} else {
				System.out.println("There is no way here so you stay at your current position.");
			}

		}
		}
	

	public void doCommand(String command, Player player) {

		// ANNROPS I ALLA SUBKLASSERS DOCOMMAND
		
		fixPath(command, player);

	}

}
