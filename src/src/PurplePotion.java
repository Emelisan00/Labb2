
public class PurplePotion extends ConsumableItem {
	
	public PurplePotion(String name) {
		super(name);
	}



	public void drink(String command, Player player, String newCommand) {
		if (getHasBeenTaken() == true){
			System.out.println("You take out the bottle from your bag and drink the liquid.\n\n");
			player.setHealth(player.getHealth() - 20);
			player.yourHealth();
			
		}
	}

}
