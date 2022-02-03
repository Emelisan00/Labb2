
public  class Item {
private String name;
private boolean hasBeenTaken;

	public Item(String name) {
		this.name = name;
		hasBeenTaken = false;
	}
	
	public void doCommand(String command, Player player, String newCommand) {
		
	}

	
	
	public String getName() {
		return name;
	}
	
	public boolean getHasBeenTaken() {
		return hasBeenTaken;
	}
	
	public void setHasBeenTaken(Boolean hasBeenTaken) {
		this.hasBeenTaken = hasBeenTaken;
	}
}
