
public class GreenPotion extends ConsumableItem {
	
	public GreenPotion(String name) {
		super(name);
	}

	public void drink(String command, Player player, String newCommand) {
		if (player.getHasDug() == true && player.getHasDrunkGreen() == false) {

			System.out.println("You take out the  bottle from your bag and drink the liquid.\n\n");
			player.setHealth(player.getHealth() + 50);
			player.yourHealth();
			player.setHasDrunkGreen(true);
	
		}
	}
}


