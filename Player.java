
public class Player {
	private String name;
	private Location position;
	private int health;
	private boolean bookStolen;
	
	public Player (String name){
		this.name = name;
		//this.position = position;	
	}
	
	public Location getLocation () {
		return this.position;
	}
	
	public void setLocation (Location location) {
		 this.position = location; 
		
	}
	
	public void describeYourself ( ) {
		
	}
	
	public void doCommand () {
		
	}
	
}
