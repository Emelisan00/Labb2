
public class Gwendalin extends OutdoorsArea{
	private Item purplePotion;
	
	public Gwendalin(String name, String description, String shortDescription) {
		super(name, description, shortDescription);	
		purplePotion = new PurplePotion("purple potion");
	}
	
	public void doCommand(String command, Player player) {
		if ((command.equals("take potion")) ) {
			takePurplePotion(player);
		}else
			fixPath(command, player);
	}
	public void takePurplePotion(Player player) {
		player.addItem(purplePotion);
		
		System.out.println("You put the purple potion in your bag");
	}
	 public Item getItem() {
		
		 return purplePotion;
	
	 }

}
