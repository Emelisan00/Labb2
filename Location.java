import java.util.ArrayList;

public class Location {
 private String name;
 private String description;
 private String shortDescription;
 private ArrayList<Location> neighbors;

 
 public Location(String name, String description, String shortDescription) {
	this.name = name;
	this.description = description;
	this.shortDescription = shortDescription;
	 
 }
 public String getDescription () {
	 return description;
 }
 
 public void describeYourself () {
		System.out.println(getDescription());
	}

 
 public void doCommand() {
	 
 }

}
