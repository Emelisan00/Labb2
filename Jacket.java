
public class Jacket extends WearableItem {
	
	public Jacket(String name) {
		super(name);
	}

	
	public void putOn(String command, Player player , String newCommand) {
		if (player.getHasGotJacket() == true ) {
			System.out.println("You take out the jacket from your bag and put it on. Ahh you feel warmer already!\n\n");
			player.setHealth(player.getHealth() + 10);
			player.yourHealth();
	}
}
}

