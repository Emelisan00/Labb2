import java.util.ArrayList;


public  class Location {
 private String name;
 private String description;
 private String shortDescription;
 private Location neighbourWest;
 private Location neighbourEast;
 Location[] neighbours = new Location[4];

 
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
 
 public String getDescription () {
	 return description;
 }
 
 public void describeYourself () {
		System.out.println(getDescription());
	}

 
 public void doCommand(String command, Player player){
 
 //ANNROPS I ALLA SUBKLASSERS DOCOMMAND
 //fixPath(command);
 
 }

}
