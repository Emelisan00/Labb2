import java.util.ArrayList;


public  class Location {
 private String name;
 private String description;
 private String shortDescription;
 private Location[] neighbours = new Location[4];
 private boolean beenHereBefore;
 private boolean hasBarrier;
 private boolean hasDug;

 
 public Location(String name, String description, String shortDescription) {
	this.name = name;
	this.description = description;
	this.shortDescription = shortDescription;
	beenHereBefore = false; 
	hasBarrier = false;
	hasDug = false;
 }
 
 public void setNeighbour(Location north, Location east, Location south, Location west) {
	neighbours[0] = north;
	neighbours[1] = east;
	neighbours[2] = south;
	neighbours[3] = west;
	 
 }
 public boolean getHasDug() {
		return hasDug;
	}

	public void setHasDug(boolean hasDug) {
		this.hasDug = hasDug;
	}
 
 public boolean getHasBarrier() {
	 return hasBarrier;
 }
 
 public Item getItem() {
	 return new Item("noItem");
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
 public void dig(Player player) {
	 System.out.println("There is nothing to dig into.");
	 
 }
 
 public void newPosition(Player player, Location position){
	 if (position != null) {
			if (position.beenHereBefore == false ){
				position.describeYourself();
				
				position.setBeenHereBefore(true);
				
				} else {
					position.shortDescribeYourself();
				}
				
				player.setLocation(position);

			} else {
				System.out.println("There is no way here so you stay at your current position.");
			}
		}
 
 
 public void fixPath(String command, Player player) {
	 
		if (command.equals("north")) {
			newPosition(player, neighbours[0]);
		
		}
		if (command.equals("east")) {

			newPosition(player, neighbours[1]);
			}

		if (command.equals("south")) {
			newPosition(player, neighbours[2]);
		}

		if (command.equals("west")) {
			newPosition(player, neighbours[3]);
		}
		}
	

	public void doCommand(String command, Player player) {

		// ANNROPS I ALLA SUBKLASSERS DOCOMMAND
		
		fixPath(command, player);

	}

}
