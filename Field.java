
public class Field extends OutdoorsArea{
	private Item greenPotion;
	private Item shovel;
	
	public Field(String name, String description, String shortDescription) {
		super(name, description, shortDescription);
		greenPotion = new GreenPotion("green potion");
		shovel = new Shovel("shovel");
		
	}
	public void doCommand(String command, Player player) {
		if(command.equals("dig")) {
			dig( player);
			
			}else if ((command.equals("take shovel")) ) {
				takeShovel(player);
			}else
				fixPath(command, player);
	}
	
	public void dig(Player player) {
	player.addItem(greenPotion);
	}
	
	public void takeShovel(Player player) {
		player.addItem(shovel);
		player.setHasShovel(true);
		System.out.println("You put the shovel in your bag");
	}
}
