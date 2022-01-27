
public class Player {
	private String name;
	private Location position;
	private int health;
	private boolean bookStolen;
	
	public Player (String name, Location position){
		this.name = name;
		this.position = position;
		int health = 100;
	}
	public String getName() {
		return name;
	}
	
	public Location getLocation () {
		return this.position;
	}
	
	public void setLocation (Location location) {
		 this.position = location; 
		
	}
	
	public void describeYourself () {
		
	}
	
	public void doCommand (String command) {
		if (command.equals("talk")) {
			try {
				position.getNPC().doCommand(command, this);
			} catch (Exception e) {
				System.out.println("There is no one to talk to");
			}
			
		}
		else if (command.equals("read")) {
			try {
				position.doCommand(command,this);
				
			} catch (Exception e) {
				System.out.println("There is no book to read.");
			}
		}
		else
		position.doCommand(command, this);
	}
}
