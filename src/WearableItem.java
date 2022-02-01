
public  class WearableItem extends Item {
 
	public WearableItem (String name) {
		super(name);
	}
	
	public void doCommand(String command, Player player, String newCommand) {
		putOn(command, player, newCommand);

}
		
	public void putOn(String command, Player player, String newCommand) {
		
		
	}
}


